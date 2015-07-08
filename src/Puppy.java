/**
 * Project: TutorialsPointJava
 * FileName: afdasd
 * Date: 2015-07-08
 * Time: 오후 2:54
 * Author: sklee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Puppy{

    public Puppy(String name){
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name );
    }
    public static void main(String []args){
        // Following statement would create an object myPuppy
        Puppy myPuppy = new Puppy( "tommy" );
    }
}