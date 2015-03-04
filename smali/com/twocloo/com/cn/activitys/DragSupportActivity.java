package com.twocloo.com.cn.activitys; class DragSupportActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/DragSupportActivity;
a=0;// .super Landroid/support/v4/app/FragmentActivity;
a=0;// .source "DragSupportActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private friend_drag:Landroid/widget/Button;
a=0;// 
a=0;// .field private my_drag:Landroid/widget/Button;
a=0;// 
a=0;// .field private topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/FragmentActivity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/DragSupportActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initView()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->topbar_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     .line 54
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->my_drag:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->my_drag:Landroid/widget/Button;
a=0;// 
a=0;//     .line 55
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->friend_drag:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->friend_drag:Landroid/widget/Button;
a=0;// 
a=0;//     .line 56
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->btn_back:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 57
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->my_drag:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->friend_drag:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->my_drag:Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     if-ne p1, v2, :cond_2
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->my_drag:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->drag_press:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->friend_drag:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->drag_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 69
a=0;//     .local v1, "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_fragment:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/fragment/DragFragment;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 79
a=0;//     .end local v0    # "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     .end local v1    # "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->btn_back:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v2, :cond_1
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/MyUserCneterActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->finish()V
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 71
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->friend_drag:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->friend_drag:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->drag_press:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->my_drag:Landroid/widget/Button;
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->drag_normal:I
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/widget/Button;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 75
a=0;//     .restart local v0    # "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 76
a=0;//     .restart local v1    # "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_fragment:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/fragment/DragFragment;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 77
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 36
a=0;//     sget v2, Lcom/twocloo/com/cn/R$layout;->drag_activity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 37
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->initView()V
a=0;// 
a=0;//     .line 38
a=0;//     sget v2, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 40
a=0;//     .local v0, "manager":Landroid/support/v4/app/FragmentManager;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 41
a=0;//     .local v1, "transaction":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_fragment:I
a=0;// 
a=0;//     new-instance v3, Lcom/twocloo/com/cn/fragment/DragFragment;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/com/cn/fragment/DragFragment;-><init>(I)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/fragment/DragFragment;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/FragmentTransaction;->add(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onDestroy()V
a=0;// 
a=0;//     .line 89
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPause()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onPause()V
a=0;// 
a=0;//     .line 97
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onResume()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-super {p0}, Landroid/support/v4/app/FragmentActivity;->onResume()V
a=0;// 
a=0;//     .line 49
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/DragSupportActivity;->topLayout:Landroid/widget/RelativeLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/RelativeLayout;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/com/cn/utils/CommonUtils;->setTopBackgroundByDayOrNight(Landroid/app/Activity;Landroid/view/View;)V
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
}}
