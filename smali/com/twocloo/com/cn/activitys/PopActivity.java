package com.twocloo.com.cn.activitys; class PopActivity { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/activitys/PopActivity;
a=0;// .super Landroid/app/Activity;
a=0;// .source "PopActivity.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/PopActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PopActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 21
a=0;//     sget v0, Lcom/twocloo/com/cn/R$layout;->activity_pop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcom/twocloo/com/cn/activitys/PopActivity;->setContentView(I)V
a=0;// 
a=0;//     .line 22
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PopActivity;->finish()V
a=0;// 
a=0;//     .line 27
a=0;//     const/high16 v2, 0x10a0000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$anim;->push_buttom_out:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v2, v3}, Lcom/twocloo/com/cn/activitys/PopActivity;->overridePendingTransition(II)V
a=0;// 
a=0;//     .line 28
a=0;//     sget-object v0, Lcom/twocloo/com/cn/common/Constants;->HUODONG_URL:Ljava/lang/String;
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "Url":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-virtual {p0}, Lcom/twocloo/com/cn/activitys/PopActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/GeneralActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 30
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "url"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 31
a=0;//     const-string v2, "title"
a=0;// 
a=0;//     const-string v3, "\u5e74\u672b\u5de8\u732e\uff0c\u7ed9\u529b\u4f18\u60e0"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 32
a=0;//     const-string v2, "from"
a=0;// 
a=0;//     const-string v3, "push"
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 33
a=0;//     invoke-virtual {p0, v1}, Lcom/twocloo/com/cn/activitys/PopActivity;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     return v2
a=0;// .end method
}}
