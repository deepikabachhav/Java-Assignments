package television.classes.objects;

public class Television {
	 private int state;
	 private int currentVolume ;
	 private int increaseVolume;
	 private int curentChannel;
	 
	 Television(int state) {
		this.state=state;
	}

	public boolean getState(){
		if(state==1){
			return true;
		}
		else
		return false;
	}

	public int getCurrentVolume() {
		
		if(state==1)
		{
			//System.out.println(currentVolume);
			return currentVolume;
		}
		else
			System.out.println("tv off ");
		return 0 ;
	}

	public int getIncreaseVolume() {
		if(state==1){
			int increaseVolume=currentVolume++;
			return increaseVolume;
		}
		else
			System.out.println("tv off ");
			return 0;
	}
	
		public int getDecreaseVolume() {
		if(state==1){
			int decreaseVolume= increaseVolume--;
			return decreaseVolume;
		}
		else
			System.out.println("tv off ");
			return 0;
	}

	public int getCurentChannel() {
		if(state==1)
		{
			return curentChannel;
		}
		else
			System.out.println("tv off ");
		return 0 ;
		
	}

	public int getChangeChannel() {
		String ChannelName="";
		if(state==1){
			switch(channelNumber){
			case 1: channelNumber= 1; "Star Plus"; 
					break;
					
			}
		}
		return 0;
	}

	public int getInitialiseVolume() {
		 int currentVolume=5;
			return currentVolume;
	}



	
	
	

}
