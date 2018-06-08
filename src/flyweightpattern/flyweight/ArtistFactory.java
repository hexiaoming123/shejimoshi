package flyweightpattern.flyweight;

import java.util.Hashtable;

/**制造可共享的ConcreteFlyweight:Artist*/
public class ArtistFactory {
		 Hashtable pool =new Hashtable();
		 Artist getArtist(Object key){
			 Artist result;
			 result =(Artist) pool.get(key);
			if (result == null) {
				//产生新的Artist
				result = new Artist();
				pool.put(key, result);
			}
			return result;
		}
}
