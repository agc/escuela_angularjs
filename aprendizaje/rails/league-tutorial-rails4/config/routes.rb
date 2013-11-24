LeagueTutorialRails4::Application.routes.draw do
  resources :teams, :except => [:new, :edit]
  resources :clubs, :except => [:new, :edit]
end