import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userType;
    
    private int years;
    
    public Long getId() {
        return id;
      }
      public void setId(Long id) {
        this.id = id;
      }
      public String getUserType() {
        return userType;
      }
      public void setUserType(String userType) {
        this.userType = userType;
      }
      public int getYears() {
          return years;
        }
        public int setId(int years) {
          this.years = years;
        }
   
}

