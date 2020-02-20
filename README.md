# 1000words
Simple web scraper for 1000mostcommonwords.com, mainly to play around with Java8

    Currently fetches list of top 1000 for Korean and Russian.

Organized into a data structure as follows:

    HashMap with (key, value) pairing of (index in top 1000, ArrayList)
  
    ArrayList is a tuple of the english word and the word in its language
    
      ex. 726=[cat, 고양이]

Dependencies:

    jSoup
