/**
 * 
 */
package com.tae.lab3;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author chant
 *
 */
public class Roomba implements SelfCheckCapable {

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Roomba";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.5);
	}

}
