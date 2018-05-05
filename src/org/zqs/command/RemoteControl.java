package org.zqs.command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    /**
     * 
     * @param size ��ʼ��Command��С
     */
    public RemoteControl(int size) {
    	onCommands = new Command[size];
    	offCommands = new Command[size];
    	for (int i = 0; i < size; i++) {
    		onCommands[i] = new OnCommand();
    		offCommands[i] = new OffCommand();
		}
    }
    /**
     * 
     * @param slot �b�ؿ���
     * @param onCommand �_
     * @param offCommand �P
     */
    public void setCommand(int slot,Command onCommand,Command offCommand) {
    	onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
    	onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
    	offCommands[slot].execute();
    }
}
