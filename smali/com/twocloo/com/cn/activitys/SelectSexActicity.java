package com.twocloo.com.cn.activitys; class SelectSexActicity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/SelectSexActicity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "SelectSexActicity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/GestureDetector$OnGestureListener;
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// .field private nan:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private nanshen:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private next:Landroid/widget/Button;
a=0;// 
a=0;// .field private nv:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private nvshen:Landroid/widget/ImageView;
a=0;// 
a=0;// .field private tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/SelectSexActicity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initview()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nanshen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nanshen:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 52
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nvshen:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nvshen:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 53
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->view:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/Button;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->next:Landroid/widget/Button;
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nanshen:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nvshen:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 56
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->next:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 57
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->tiaoguo:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 59
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nan_sel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nan:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 60
a=0;//     sget v0, Lcom/twocloo/com/cn/R$id;->nv_sel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/ImageView;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nv:Landroid/widget/ImageView;
a=0;// 
a=0;//     .line 61
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
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 83
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nanshen:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/ImageView;);
a=0;//     if-ne p1, v1, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nan:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nv:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 88
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->finish()V
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nvshen:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nan:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nv:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 92
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 93
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     #v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->next:Landroid/widget/Button;
a=0;// 
a=0;//     if-ne p1, v1, :cond_4
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 99
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 101
a=0;//     :cond_4
a=0;//     #v2=(PosByte);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->tiaoguo:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 104
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 37
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 38
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->select_sex_fragment:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->setContentView(I)V
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     invoke-direct {v0, p0}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->initview()V
a=0;// 
a=0;//     .line 41
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nan:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nv:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(PosByte);
a=0;//     return-void
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getUserSex(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nan:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 46
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->nv:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDestroy()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onDestroy()V
a=0;// 
a=0;//     .line 79
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDown(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "velocityX"    # F
a=0;//     .param p4, "velocityY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     const/high16 v0, -0x3ee00000    # -10.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, p3, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->finish()V
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLongPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestart()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_left_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_left_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 66
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onRestart()V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
a=0;//     .locals 2
a=0;//     .param p1, "e1"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "e2"    # Landroid/view/MotionEvent;
a=0;//     .param p3, "distanceX"    # F
a=0;//     .param p4, "distanceY"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     const/high16 v0, -0x3ee00000    # -10.0f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpg-float v0, p3, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v1, Lcom/twocloo/com/cn/activitys/SelectBookActivity;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->finish()V
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onShowPress(Landroid/view/MotionEvent;)V
a=0;//     .locals 0
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSingleTapUp(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "e"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     sget v0, Lcom/twocloo/com/cn/R$anim;->push_right_in:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget v1, Lcom/twocloo/com/cn/R$anim;->push_right_out:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 72
a=0;//     invoke-super {p0}, Landroid/app/Activity;->onStop()V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/SelectSexActicity;->mGestureDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 151
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
