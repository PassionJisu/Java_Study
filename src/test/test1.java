package test;

class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String[] v_l = video_len.split(":");
        String[] ps = pos.split(":");
        String[] start = op_start.split(":");
        String[] end = op_end.split(":");
        
        int vl_int = Integer.parseInt(v_l[0])*60 + Integer.parseInt(v_l[1]);
        int ps_int = Integer.parseInt(ps[0])*60 + Integer.parseInt(ps[1]);
        int start_int = Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]);
        int end_int = Integer.parseInt(end[0])*60 + Integer.parseInt(end[1]);
        
        boolean skip = (ps_int >= start_int && ps_int <= end_int);
        boolean start_over = ps_int <= 10;
        boolean end_over = (vl_int - ps_int) <= 10;
        
        for(int i = 0; i < commands.length ; i++){
            if(skip) ps_int = end_int;
            
            if(commands[i].equals("next")){
                ps_int += 10;
                if(end_over) ps_int = vl_int;
            }
            if(commands[i].equals("prev")){
                ps_int -= 10;
                if(start_over) ps_int = 0;
            }    
        }
        if(skip) ps_int = end_int;
        
        int hour = ps_int / 60;
        int minute = ps_int % 60;
        
        answer = String.format("%02d:%02d", hour, minute);
        return answer;
    }

    public static void main(String[] args) {
        String[] str = {"next", "prev"};
        String a = solution("34:33", "13:00", "00:55" , "02:55" , str);
        System.out.println(a);
    }
}