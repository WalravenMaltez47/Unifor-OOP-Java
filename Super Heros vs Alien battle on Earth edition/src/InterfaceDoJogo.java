interface InterfaceDoJogo {
   void setStart(String start) throws StartException;
   int getDano();
   int getVida(int dano);
   int healing(int hp);
   int getFinalHp();
}
