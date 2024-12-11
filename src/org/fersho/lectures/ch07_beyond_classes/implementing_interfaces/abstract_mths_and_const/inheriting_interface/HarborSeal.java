package org.fersho.lectures.ch07_beyond_classes.implementing_interfaces.abstract_mths_and_const.inheriting_interface;

public abstract class HarborSeal implements HasTail, HasWhiskers {

}

interface HasTail {
    public int getTailLength();
}

interface HasWhiskers {
    public int getNumberOfWhiskers();
}

/*
 * The type CommonSeal must implement the inherited abstract method
 * HasTail.getTailLength()Java(67109264)
 * The type CommonSeal must implement the inherited abstract method
 * HasWhiskers.getNumberOfWhiskers()Java(67109264)
 */

// class CommonSeal extends HarborSeal {

//     // @Override
//     // public int getTailLength() {
//     // // TODO Auto-generated method stub
//     // throw new UnsupportedOperationException("Unimplemented method
//     // 'getTailLength'");
//     // }

//     // @Override
//     // public int getNumberOfWhiskers() {
//     // // TODO Auto-generated method stub
//     // throw new UnsupportedOperationException("Unimplemented method
//     // 'getNumberOfWhiskers'");
//     // }
// }