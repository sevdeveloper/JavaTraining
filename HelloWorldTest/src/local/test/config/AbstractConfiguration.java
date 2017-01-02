/**
 * 
 */
package local.test.config;

/**
 * @author AUser
 *
 */
public abstract class AbstractConfiguration implements Configuration {

	protected int xxx;
    protected boolean yyy;
    protected String zzz;
    
	/* (non-Javadoc)
	 * @see local.test.config.Configuration#getXXX()
	 */
	@Override
	public int getXXX() {
		// TODO Auto-generated method stub
		return xxx;
	}

	/* (non-Javadoc)
	 * @see local.test.config.Configuration#isYYY()
	 */
	@Override
	public boolean isYYY() {
		// TODO Auto-generated method stub
		return yyy;
	}

	/* (non-Javadoc)
	 * @see local.test.config.Configuration#getZZZ()
	 */
	@Override
	public String getZZZ() {
		// TODO Auto-generated method stub
		return zzz;
	}

}
