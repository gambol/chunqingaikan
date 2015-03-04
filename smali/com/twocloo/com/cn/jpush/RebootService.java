package com.twocloo.com.cn.jpush; class RebootService { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/jpush/RebootService;
a=0;// .super Landroid/app/Service;
a=0;// .source "RebootService.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/jpush/RebootService;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onStartCommand(Landroid/content/Intent;II)I
a=0;//     .locals 9
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "flags"    # I
a=0;//     .param p3, "startId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 30
a=0;//     #v1=(Null);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 31
a=0;//     .local v7, "c":Ljava/util/Calendar;
a=0;//     #v7=(Reference,Ljava/util/Calendar;);
a=0;//     new-instance v8, Landroid/content/Intent;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v2, Lcom/twocloo/com/cn/jpush/AlarmReceiver;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v8, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 32
a=0;//     .local v8, "intent_reboot":Landroid/content/Intent;
a=0;//     #v8=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "twocloo"
a=0;// 
a=0;//     invoke-virtual {v8, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 33
a=0;//     invoke-static {p0, v1, v8, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 35
a=0;//     .local v6, "pi":Landroid/app/PendingIntent;
a=0;//     #v6=(Reference,Landroid/app/PendingIntent;);
a=0;//     const-string v2, "alarm"
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Lcom/twocloo/com/cn/jpush/RebootService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/AlarmManager;
a=0;// 
a=0;//     .line 39
a=0;//     .local v0, "am":Landroid/app/AlarmManager;
a=0;//     invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/32 v4, 0x36ee80
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 41
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     return v1
a=0;// .end method
}}
