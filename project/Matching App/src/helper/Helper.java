/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;
import java.awt.Panel;
import javax.swing.*;
/**
 *
 * @author Sai Lin Htet
 */
public class Helper {
    public static int fieldToIndex(String field) {
        return field == "id" ? 0
                : field == "userName" ? 1
                        : field == "password" ? 2
                                : field == "name" ? 3
                                        : field == "gender" ? 4
                                                : field == "phone" ? 5
                                                        : field == "age" ? 6
                                                                : field == "zodiac sign" ? 7
                                                                        : field == "height" ? 8
                                                                                : field == "weight" ? 9
                                                                                        : field == "hobby" ? 10 : 11;
    }

    public static String indexToField(int index) {
        return index == 0 ? "id"
                : index == 1 ? "userName"
                        : index == 2 ? "password"
                                : index == 3 ? "name"
                                        : index == 4 ? "gender"
                                                : index == 5 ? "phone"
                                                        : index == 6 ? "age"
                                                                : index == 7 ? "zodiac sign"
                                                                        : index == 8 ? "height"
                                                                                : index == 9 ? "weight"
                                                                                        : index == 10 ? "hobby" : "bio";
    }
    public static boolean isEmpty(String text) {
        if(text.isEmpty()){
            return true;
        }
        return false;
    }
    public  JPanel createCrad(String[] userInfo) {
      String profile= userInfo[4].equals("Male")? "/assets/male.png":userInfo[4].equals("Female")? "/assets/female.png":"/assets/other.png";
         javax.swing.JPanel UserCard = new javax.swing.JPanel();
      javax.swing.JLabel  _profile = new javax.swing.JLabel();
      javax.swing.JLabel  _name = new javax.swing.JLabel();
      javax.swing.JLabel  _age = new javax.swing.JLabel();
     javax.swing.JLabel   _phone = new javax.swing.JLabel();
     javax.swing.JLabel   _zodic = new javax.swing.JLabel();
     javax.swing.JLabel   _height = new javax.swing.JLabel();
      javax.swing.JLabel  _weight = new javax.swing.JLabel();
      javax.swing.JLabel  jLabel8 = new javax.swing.JLabel();
      javax.swing.JLabel  _bio = new javax.swing.JLabel();
       javax.swing.JLabel _bioLabel = new javax.swing.JLabel();
        
                UserCard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        _profile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        _profile.setIcon(new javax.swing.ImageIcon(getClass().getResource(profile))); // NOI18N
        _profile.setName(""); // NOI18N

        _name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        _name.setText(userInfo[3]);

        _age.setText("age: "+userInfo[6]);

        _phone.setText("phone: "+userInfo[5]);

        _zodic.setText("zodic:"+userInfo[7]);

        _height.setText("height: "+userInfo[8]+"cm");

        _weight.setText("weight:"+userInfo[9]+"kg");

        jLabel8.setText("hobby: "+userInfo[10]);

        _bio.setText(userInfo[11]);
        _bio.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        _bioLabel.setText("bio:");

        javax.swing.GroupLayout UserCardLayout = new javax.swing.GroupLayout(UserCard);
        UserCard.setLayout(UserCardLayout);
        UserCardLayout.setHorizontalGroup(
            UserCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserCardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_name)
                    .addGroup(UserCardLayout.createSequentialGroup()
                        .addComponent(_age)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_phone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_zodic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_height)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_weight))
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(UserCardLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(_bioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(_bio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        UserCardLayout.setVerticalGroup(
            UserCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserCardLayout.createSequentialGroup()
                .addGroup(UserCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserCardLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserCardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UserCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_age)
                            .addComponent(_phone)
                            .addComponent(_zodic)
                            .addComponent(_height)
                            .addComponent(_weight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UserCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(_bioLabel)
                    .addComponent(_bio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        ); 
       
        return UserCard;
    }
}