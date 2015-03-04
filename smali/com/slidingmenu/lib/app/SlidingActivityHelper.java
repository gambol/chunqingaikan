package com.slidingmenu.lib.app; class SlidingActivityHelper { void a() { int a;
a=0;// .class public Lcom/slidingmenu/lib/app/SlidingActivityHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SlidingActivityHelper.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivity:Landroid/app/Activity;
a=0;// 
a=0;// .field private mBroadcasting:Z
a=0;// 
a=0;// .field private mEnableSlide:Z
a=0;// 
a=0;// .field private mOnPostCreateCalled:Z
a=0;// 
a=0;// .field private mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;// .field private mViewAbove:Landroid/view/View;
a=0;// 
a=0;// .field private mViewBehind:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/app/Activity;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 35
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/slidingmenu/lib/app/SlidingActivityHelper;);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mBroadcasting:Z
a=0;// 
a=0;//     .line 26
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mOnPostCreateCalled:Z
a=0;// 
a=0;//     .line 28
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mEnableSlide:Z
a=0;// 
a=0;//     .line 36
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 37
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/slidingmenu/lib/app/SlidingActivityHelper;)Lcom/slidingmenu/lib/SlidingMenu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 18
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public findViewById(I)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Lcom/slidingmenu/lib/SlidingMenu;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 111
a=0;//     .local v0, "v":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     .end local v0    # "v":Landroid/view/View;
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSlidingMenu()Lcom/slidingmenu/lib/SlidingMenu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 3
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/slidingmenu/lib/R$layout;->slidingmenumain:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     .line 46
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->isMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p0}, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->showContent()V
a=0;// 
a=0;//     .line 214
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 216
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onPostCreate(Landroid/os/Bundle;)V
a=0;//     .locals 6
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 54
a=0;//     #v2=(One);
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mViewBehind:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mViewAbove:Landroid/view/View;
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v3, "Both setBehindContentView must be called in onCreate in addition to setContentView."
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mOnPostCreateCalled:Z
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v3, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     iget-object v4, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     .line 62
a=0;//     #v4=(Reference,Landroid/app/Activity;);
a=0;//     iget-boolean v5, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mEnableSlide:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v3, v4, v2}, Lcom/slidingmenu/lib/SlidingMenu;->attachToActivity(Landroid/app/Activity;I)V
a=0;// 
a=0;//     .line 66
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 67
a=0;//     const-string v2, "SlidingActivityHelper.open"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "open":Z
a=0;//     #v0=(Boolean);
a=0;//     const-string v2, "SlidingActivityHelper.secondary"
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 73
a=0;//     .local v1, "secondary":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     new-instance v2, Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v2}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v3, Lcom/slidingmenu/lib/app/SlidingActivityHelper$1;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/slidingmenu/lib/app/SlidingActivityHelper$1;);
a=0;//     invoke-direct {v3, p0, v0, v1}, Lcom/slidingmenu/lib/app/SlidingActivityHelper$1;-><init>(Lcom/slidingmenu/lib/app/SlidingActivityHelper;ZZ)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/slidingmenu/lib/app/SlidingActivityHelper$1;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// 
a=0;//     .line 70
a=0;//     .end local v0    # "open":Z
a=0;//     .end local v1    # "secondary":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     .restart local v0    # "open":Z
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "secondary":Z
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 2
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     const-string v0, "SlidingActivityHelper.open"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v1}, Lcom/slidingmenu/lib/SlidingMenu;->isMenuShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 126
a=0;//     const-string v0, "SlidingActivityHelper.secondary"
a=0;// 
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v1=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v1}, Lcom/slidingmenu/lib/SlidingMenu;->isSecondaryMenuShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public registerAboveContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mBroadcasting:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mViewAbove:Landroid/view/View;
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setBehindContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "layoutParams"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iput-object p1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mViewBehind:Landroid/view/View;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     iget-object v1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mViewBehind:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Lcom/slidingmenu/lib/SlidingMenu;->setMenu(Landroid/view/View;)V
a=0;// 
a=0;//     .line 164
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mBroadcasting:Z
a=0;// 
a=0;//     .line 151
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mActivity:Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSlidingActionBarEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "slidingActionBarEnabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     iget-boolean v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mOnPostCreateCalled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "enableSlidingActionBar must be called in onCreate."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iput-boolean p1, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mEnableSlide:Z
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showContent()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->showContent()V
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->showMenu()V
a=0;// 
a=0;//     .line 194
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showSecondaryMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->showSecondaryMenu()V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toggle()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iget-object v0, p0, Lcom/slidingmenu/lib/app/SlidingActivityHelper;->mSlidingMenu:Lcom/slidingmenu/lib/SlidingMenu;
a=0;// 
a=0;//     #v0=(Reference,Lcom/slidingmenu/lib/SlidingMenu;);
a=0;//     invoke-virtual {v0}, Lcom/slidingmenu/lib/SlidingMenu;->toggle()V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// .end method
}}
