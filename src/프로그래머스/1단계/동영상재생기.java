package 프로그래머스.1단계;

class 동영상재생기기 {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String[] v_l = video_len.split(":");
        String[] ps = pos.split(":");
        String[] start = op_start.split(":");
        String[] end = op_end.split(":");
        
        int vl_int = Integer.parseInt(v_l[0])*60 + Integer.parseInt(v_l[1]);
        int ps_int = Integer.parseInt(ps[0])*60 + Integer.parseInt(ps[1]);
        int start_int = Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]);
        int end_int = Integer.parseInt(end[0])*60 + Integer.parseInt(end[1]);
    
        
        if(ps_int >= start_int && ps_int <= end_int) ps_int = end_int;
       
        
        
        for(int i = 0; i < commands.length ; i++){
            
            if(ps_int >= start_int && ps_int <= end_int) ps_int = end_int;
            
            if(commands[i].equals("next")){
                if(ps_int == vl_int) continue;
                ps_int += 10;
                if((vl_int - ps_int) < 10) ps_int = vl_int;
            }
            else if(commands[i].equals("prev")){
                if(ps_int == 0) continue;
                ps_int -= 10;
                if(ps_int <= 0) ps_int = 0;
            }    
        }
      if(ps_int >= start_int && ps_int <= end_int) ps_int = end_int;
        
        int hour = ps_int / 60;
        int minute = ps_int % 60;
        
        answer = String.format("%02d:%02d", hour, minute);
        return answer;
    }
}

