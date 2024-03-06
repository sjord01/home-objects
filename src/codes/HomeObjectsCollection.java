import java.util.ArrayList;
import java.util.List;

public class HomeObjectsCollection {
    private List<HomeObjects> items;

    public HomeObjectsCollection()
    {
        items = new ArrayList<>();
    }

    public void addItem(HomeObjects item)
    {
        items.add(item);
    }

    public void removeItem(HomeObjects item)
    {
        items.remove(item);
    }

    public void displayItems()
    {
        for(final HomeObjects item : items)
        {
            System.out.println("Home Object Name: " + item.getHomeObjectName() + ", Home ObjectType: " + item.getType());
        }
    }

    public int getNumberOfItems()
    {
        return items.size();
    }
}
     