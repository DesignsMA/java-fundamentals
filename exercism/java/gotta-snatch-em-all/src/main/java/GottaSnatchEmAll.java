import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.containsAll(theirCollection) && !theirCollection.containsAll(myCollection);
    }

    static Set<String> commonCards(List<Set<String>> collections)
     {
        Set<String> commonCardSet = new HashSet<>();
        
        if (collections.isEmpty()) {
            return commonCardSet;
        }
        else {
            commonCardSet.addAll(collections.get(0));
        }

        for (Set<String> collection : collections) {
            commonCardSet.retainAll(collection);
        }
        return commonCardSet;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCardSet = new HashSet<>();
        for (Set<String> collection : collections) {
            allCardSet.addAll(collection);
        }
        return allCardSet;
    }
}
