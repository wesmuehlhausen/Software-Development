package Farkle;

public class Score {

    public int findThrees(Hand farkle_hand) {
        int count = 0;
        for (int i = 0; i < farkle_hand.getCards(); ++i) {
            if (farkle_hand.getCardValue(i) == 2)
            {
                if(farkle_hand.getCardAvailability(i))
                {
                    count++;
                    farkle_hand.setCardAvailibility(i, false);
                }
            }
        }
        return count;
    }

    public int findPairs(Hand farkle_hand)
    {
        int count = 0;
        for(int i = 1; i < farkle_hand.getCards(); ++i)
        {
            if(farkle_hand.getCardValue(i) == farkle_hand.getCardValue(i-1))
            {
                if(farkle_hand.getCardAvailability(i) && farkle_hand.getCardAvailability(i-1))
                {
                    count++;
                    farkle_hand.setCardAvailibility(i, false);
                    farkle_hand.setCardAvailibility(i - 1, false);
                    
                }
            }
        }
        return count;
    }
            
            
    public int findSevens(Hand farkle_hand) {
        int count = 0;
        for (int i = 0; i < farkle_hand.getCards(); ++i) {
            if (farkle_hand.getCardValue(i) == 6)
            {
               if(farkle_hand.getCardAvailability(i))
               {
                  count++;
                  farkle_hand.setCardAvailibility(i, false);
               }
            }
        }
        return count;
    }

    public int findFaces(Hand farkle_hand) {
        int count = 0;
        for (int i = 0; i < farkle_hand.getCards(); ++i) {
            for (int j = 0; j < 3; ++j) {
                if (farkle_hand.getCardValue(i) == j + 10 || farkle_hand.getCardValue(i) == 0)
                {
                    if(farkle_hand.getCardAvailability(i))
                    {
                        count++;
                        farkle_hand.setCardAvailibility(i, false);
                    }
                }
            }
        }
        return count;
    }

    public int maxOfAKindFound(Hand farkle_hand) {
        int maxCount = 0;
        int currentCount;
        int value = 0;

        for (int cardValue = 0; cardValue < 13; ++cardValue) {
            currentCount = 0;
            for (int cardPosition = 0; cardPosition < farkle_hand.getCards(); ++cardPosition) {
                if (cardValue == farkle_hand.getCardValue(cardPosition))
                {
                   if(farkle_hand.getCardAvailability(cardPosition))
                    {
                        ++currentCount;
                    }
                }
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
                value = cardValue;
            }
        }
        
        if(maxCount >= 3)
        {
            for(int i = 0; i < farkle_hand.getCards(); ++i)
            {
                if(value == farkle_hand.getCardValue(i))
                    farkle_hand.setCardAvailibility(i, false);
            }
        }
        
        return maxCount;
    }

    public int maxOfASuitFound(Hand farkle_hand, int suit) {
        int maxCount = 0;
        int currentCount;
 

        for (int cardSuit = 0; cardSuit < 4; ++cardSuit) {
            currentCount = 0;
            for (int cardPosition = 0; cardPosition < farkle_hand.getCards(); ++cardPosition) {
                if (cardSuit == farkle_hand.getCardSuit(cardPosition))
                    ++currentCount;
            }
            if (currentCount > maxCount){
                suit = cardSuit;
                maxCount = currentCount;
            }
        }
        
        return maxCount;
    }

    public int maxStraightFound(Hand farkle_hand, int indexR) {
        int maxLength = 1;
        int curLength = 1;
        int index = 13;
        
        if (farkle_hand.getCards() >= 5) {
            for (int i = 0; i < farkle_hand.getCards() - 1; ++i) {
                if (index == 13) {
                    for (int j = 0; j < 13; ++j) {
                        if (farkle_hand.getCardValue(i) == j) {
                            index = j;
                            indexR = farkle_hand.getCardValue(i);
                            break;
                        }
                    }
                }
                if (index + 1 == farkle_hand.getCardValue(i + 1)) {
                    curLength++;   
                    index++;
                } else{
                    curLength = 1;
                    index = 13;                  
                }
                if (curLength > maxLength)
                    maxLength = curLength;
            }
        }
        return maxLength;
    }

    public boolean fullHouseFound(Hand farkle_hand) {
        boolean found3K = false;
        boolean foundFH = false;

        int ThreeKValue = -1;

        if (farkle_hand.getCards() >= 5) {
            for (int i = 1; i < farkle_hand.getCards() - 1; ++i) {
                if (farkle_hand.getCardValue(i) == farkle_hand.getCardValue(i - 1) && farkle_hand.getCardValue(i) == farkle_hand.getCardValue(i + 1)) {
                    if(farkle_hand.getCardAvailability(i) && farkle_hand.getCardAvailability(i-1))
                    {
                        if(farkle_hand.getCardAvailability(i+1))
                        {
                            found3K = true;
                            ThreeKValue = farkle_hand.getCardValue(i);
                        }
                    }
                }
            }
            if (found3K) {
                for (int i = 1; i < farkle_hand.getCards(); ++i) {
                    if (farkle_hand.getCardValue(i) == farkle_hand.getCardValue(i - 1) && farkle_hand.getCardValue(i) != ThreeKValue) {
                        foundFH = true;
                        farkle_hand.setCardAvailibility(i, false);
                        farkle_hand.setCardAvailibility(i - 1, false);
                        break;
                    }
                }
            }
        }
        if(foundFH)
        {
            int count = 0;
            for(int i = 0; i < farkle_hand.getCards(); ++i)
            {
                if(farkle_hand.getCardValue(i) == ThreeKValue && count < 3)
                {
                    farkle_hand.setCardAvailibility(i, false);
                    ++count;
                }
            }
        }
        return foundFH;
    }

    public boolean royalFlushFound(Hand farkle_hand) {
        boolean RFFound = false;
        boolean start = false;
        int suit = 0;
        int counter = 0;
        int count2 = 0;
        int temp = 0;
        if (maxStraightFound(farkle_hand, temp) >= 5 && maxOfASuitFound(farkle_hand, temp) >= 5) {
            for (int i = 0; i < farkle_hand.getCards() - 4; ++i) {
                if (farkle_hand.getCardValue(i) == 9) {
                    counter = i;
                    count2 = i;
                    suit = farkle_hand.getCardSuit(i);
                    start = true;
                    break;
                }
            }
            if (start) {
                for (int i = 0; i < 4; ++i) {
                    counter++;
                    if (10 + i == 13) {
                        if (farkle_hand.getCardValue(counter) == 0 && farkle_hand.getCardSuit(counter) == suit) {
                            RFFound = true;
                            break;
                        }
                    }
                    if (farkle_hand.getCardValue(counter) != 10 + i || farkle_hand.getCardSuit(counter) != suit)
                        break;
                }
            }
        }
        if(RFFound)
        {
            for(int i = count2; i < count2 + 5; ++i)
            {
                farkle_hand.setCardAvailibility(i, false);
            }
        }
        return RFFound;
    }

}
