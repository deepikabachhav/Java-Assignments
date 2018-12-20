/* Super class Training for implementing the inheritance */

package com.training;
/**
 * @author dbachhav
 *Class Training is a abstract class beacause one method getOrderValue() is abstract in it.
 *To initialise properties of the class.
 */
public abstract class Training {
		private static int idInitiat;
		private int id;
		private  String subject;
		protected  double fees;
		
		/**
		 * toString() method to return the values of parameters.
		 */
		@Override
		public String toString() {
			return "Training [id=" + id + ", subject=" + subject + ", fees="+ fees + "]";
		}
		/**
		 * Initializers for incrementing the ID which has two fields static field to initialise ID  and non-static field to increment ID. 
		 */
		static{
			idInitiat=100;
		}
		{
			++idInitiat;
		}
		/**
		 * Argument Constructor which has parameters subject and fees to initiate class objects.
		 * @param subject
		 * @param fees
		 */
		public Training(String subject, double fees){
			this.subject=subject;
			this.fees=fees;
			this.id =idInitiat;
		}
		/**
		 * create getter to return the ID.
		 * @return
		 */
		public  int getid() {
			return id;
		}
		/**
		 * create getter to return the subject 
		 * @return
		 */
		public  String getSubject() {
			return subject;
		}
		/**
		 * create method to return the fees for training.
		 * @return
		 */
		public  double getFees() {
			return fees;
		}
		/**
		 * getOrderValue() is the abstract method which will implemented in the subclasses that are corporate training and public training.
		 */
		 public abstract double getOrderValue();
			
	}


