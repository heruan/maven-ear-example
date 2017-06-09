package war;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        // TODO Auto-generated method stub
        return super.getClasses();
    }

}
