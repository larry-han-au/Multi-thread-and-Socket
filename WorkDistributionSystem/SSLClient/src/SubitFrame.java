import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
/**
 * swing基础实例
 * @author HZ20232
 *
 */
public class SubitFrame extends JFrame{
	private static JTextField job1_jar;
	private static JTextField job1_input;
	private static JTextField job2_jar;
	private static JTextField job2_input;
	private static JTextField job3_jar;
	private static JTextField job3_input;
	private static JTextField job1_output;
	private static JTextField job2_output;
	private static JTextField job3_output;
	private static JTextField job1_workload;
	private static JTextField job2_workload;
	private static JTextField job3_workload;
	private static ArrayList<String[]> jobList=new ArrayList<String[]>();
	private static JTextField job1_waittime;
	private static JTextField job2_waittime;
	private static JTextField job3_waittime;

	public static void main(String args[])throws Exception{
		JFrame frame1 = new JFrame();
		frame1.setSize(900,300);
		frame1.getContentPane().setLayout(null);
		frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame1.setVisible(true);

		JLabel lblWorkload = new JLabel("Workload");
		lblWorkload.setBounds(650, 33, 61, 16);
		frame1.getContentPane().add(lblWorkload);

		JLabel lblJarFile = new JLabel("Jar File");
		lblJarFile.setBounds(160, 38, 61, 16);
		frame1.getContentPane().add(lblJarFile);

		JLabel lblInputFile = new JLabel("Input File");
		lblInputFile.setBounds(344, 38, 61, 16);
		frame1.getContentPane().add(lblInputFile);

		JLabel lblLongestWaitingTime = new JLabel("Longest Wait Time");
		lblLongestWaitingTime.setBounds(745, 33, 145, 16);
		frame1.getContentPane().add(lblLongestWaitingTime);

		job1_input = new JTextField();
		job1_input.setColumns(10);
		job1_input.setBounds(287, 55, 192, 30);
		frame1.getContentPane().add(job1_input);

		job2_input = new JTextField();
		job2_input.setColumns(10);
		job2_input.setBounds(287, 97, 192, 30);
		frame1.getContentPane().add(job2_input);

		job3_input = new JTextField();
		job3_input.setColumns(10);
		job3_input.setBounds(287, 144, 192, 30);
		frame1.getContentPane().add(job3_input);

		job1_jar = new JTextField();
		job1_jar.setBounds(83, 55, 192, 30);
		frame1.getContentPane().add(job1_jar);
		job1_jar.setColumns(10);



		job2_jar = new JTextField();
		job2_jar.setColumns(10);
		job2_jar.setBounds(83, 97, 192, 30);
		frame1.getContentPane().add(job2_jar);


		job3_jar = new JTextField();
		job3_jar.setColumns(10);
		job3_jar.setBounds(83, 145, 192, 30);
		frame1.getContentPane().add(job3_jar);


		JLabel lblNewLabel = new JLabel("Job1");
		lblNewLabel.setBounds(16, 62, 61, 16);
		frame1.getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("Job2");
		label.setBounds(16, 104, 61, 16);
		frame1.getContentPane().add(label);

		JLabel label_1 = new JLabel("Job3");
		label_1.setBounds(16, 151, 61, 16);
		frame1.getContentPane().add(label_1);

		JLabel lblOutputFile = new JLabel("Output File Name");
		lblOutputFile.setBounds(493, 33, 117, 16);
		frame1.getContentPane().add(lblOutputFile);

		job1_output = new JTextField();
		job1_output.setColumns(10);
		job1_output.setBounds(479, 55, 140, 30);
		frame1.getContentPane().add(job1_output);

		job2_output = new JTextField();
		job2_output.setColumns(10);
		job2_output.setBounds(479, 97, 140, 30);
		frame1.getContentPane().add(job2_output);

		job3_output = new JTextField();
		job3_output.setColumns(10);
		job3_output.setBounds(479, 144, 140, 30);
		frame1.getContentPane().add(job3_output);

		job1_workload = new JTextField();
		job1_workload.setColumns(10);
		job1_workload.setBounds(627, 56, 106, 30);
		frame1.getContentPane().add(job1_workload);

		job2_workload = new JTextField();
		job2_workload.setColumns(10);
		job2_workload.setBounds(627, 97, 106, 30);
		frame1.getContentPane().add(job2_workload);

		job3_workload = new JTextField();
		job3_workload.setColumns(10);
		job3_workload.setBounds(627, 144, 106, 30);
		frame1.getContentPane().add(job3_workload);

		job1_waittime = new JTextField();
		job1_waittime.setColumns(10);
		job1_waittime.setBounds(745, 56, 106, 30);
		frame1.getContentPane().add(job1_waittime);

		job2_waittime = new JTextField();
		job2_waittime.setColumns(10);
		job2_waittime.setBounds(745, 97, 106, 30);
		frame1.getContentPane().add(job2_waittime);

		job3_waittime = new JTextField();
		job3_waittime.setColumns(10);
		job3_waittime.setBounds(745, 145, 106, 30);
		frame1.getContentPane().add(job3_waittime);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if ((job1_jar.getText()!=null)&&(job1_jar.getText()!="")){
					String[] job1={job1_jar.getText().toString(),
							job1_input.getText().toString(),
							job1_output.getText().toString(),
							job1_workload.getText().toString(),
							job1_waittime.getText().toString()};
					jobList.add(job1);
				}
				if ((job2_jar.getText()!=null)&&(job2_jar.getText()!="")){
					String[] job2={job2_jar.getText().toString(),
							job2_input.getText().toString(),
							job2_output.getText().toString(),
							job2_workload.getText().toString(),
							job2_waittime.getText().toString()};
					jobList.add(job2);
				}
				if ((job3_jar.getText()!=null)&&(job3_jar.getText()!="")){
					String[] job3={job3_jar.getText().toString(),
							job3_input.getText().toString(),
							job3_output.getText().toString(),
							job3_workload.getText().toString(),
							job3_waittime.getText().toString()};
					jobList.add(job3);
				}
				JobGUI jobFram=new JobGUI();
				jobFram.setVisible(true);
				frame1.dispose();
				
			}
		});
		btnSubmit.setBounds(347, 221, 117, 29);
		frame1.getContentPane().add(btnSubmit);



	}
}

