public class RadioService {
    public class RadioService {


        // ниже перечислены методы, которые будут вызываться при клике на соответсвующую кнопку
        public int ButtonWale0() {
            int currentWave = 0;
            return currentWave;
        }

        public int ButtonWale1() {
            int currentWave = 1;
            return currentWave;
        }

        public int ButtonWale2() {
            int currentWave = 2;
            return currentWave;
        }

        public int ButtonWale3() {
            int currentWave = 3;
            return currentWave;
        }

        public int ButtonWale4() {
            int currentWave = 4;
            return currentWave;
        }

        public int ButtonWale5() {
            int currentWave = 5;
            return currentWave;
        }

        public int ButtonWale6() {
            int currentWave = 6;
            return currentWave;
        }

        public int ButtonWale7() {
            int currentWave = 7;
            return currentWave;
        }

        public int ButtonWale8() {
            int currentWave = 8;
            return currentWave;
        }

        public int ButtonWale9() {
            int currentWave = 9;
            return currentWave;
        }
        // выше перечислены методы, которые будут вызываться при клике на соответсвующую кнопку и включать нужную волну


        // ниже перечислены методы, которые будут вызываться при клике на кнопку даллее либо назад
        public int NextWale(int[] wave){
            int wale = 1 + wave;
            if (wale < 0) {
                wale = 9;}
            return wale;
        }


        public int PrefWale (int[] wave){
            int wale = wave - 1;
            if (wale < 0) {
                wale = 9;}
            return wale;
        }


        // выше перечислены методы, которые будут вызываться при клике на кнопку даллее либо назад


        // ниже перечислены методы, которые будут вызываться при клике на соответсвующую кнопку
        public int ButtonVolume0 () {
            int volume = 0;
            return volume;
        }

        public int ButtonVolume1 () {
            int volume = 1;
            return volume;
        }

        public int ButtonVolume2 () {
            int volume = 2;
            return volume;
        }

        public int ButtonVolume3 () {
            int volume = 3;
            return volume;
        }

        public int ButtonVolume4 () {
            int volume = 4;
            return volume;
        }

        public int ButtonVolume5 () {
            int volume = 5;
            return volume;
        }

        public int ButtonVolume6 () {
            int volume = 6;
            return volume;
        }

        public int ButtonVolume7 () {
            int volume = 7;
            return volume;
        }

        public int ButtonVolume8 () {
            int volume = 8;
            return volume;
        }

        public int ButtonVolume9 () {
            int volume = 9;
            return volume;
        }

        public int ButtonVolume10 () {
            int volume = 10;
            return volume;
        }
        // выше перечислены методы, которые будут вызываться при клике на соответсвующую кнопку и включать нужную волну


        // ниже перечислены методы, которые будут вызываться при клике на кнопку даллее либо назад
        public int NextVolume (int[] volume){
            int volume = volume + 1;
            if (volume < 0) {
                volume = 9;
            }
            return volume;
        }

        public int PrefVolume (int[] volume){
            int volume = volume - 1;
            if (volume < 0) {
                volume = 9;
            }
            return volume;
        }
// выше перечислены методы, которые будут вызываться при клике на кнопку даллее либо назад


    }
