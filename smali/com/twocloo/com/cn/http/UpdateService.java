package com.twocloo.com.cn.http; class UpdateService { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/http/UpdateService;
a=0;// .super Landroid/app/Service;
a=0;// .source "UpdateService.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation build Landroid/annotation/SuppressLint;
a=0;//     value = {
a=0;//         "HandlerLeak"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field private timer:Ljava/util/Timer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/http/UpdateService;);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/UpdateService$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/UpdateService$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/http/UpdateService$1;-><init>(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/UpdateService$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/http/UpdateService;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/UpdateService;->doUp()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/http/UpdateService;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateService;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private doUp()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     new-instance v0, Lcom/twocloo/com/cn/http/UpdateService$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/http/UpdateService$3;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/http/UpdateService$3;-><init>(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;// 
a=0;//     .line 126
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/http/UpdateService$3;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/http/UpdateService$3;->start()V
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getUpBookETime()Ljava/util/Date;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 169
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "cal":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v2, 0x15
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 172
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 173
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private getUpBookSTime()Ljava/util/Date;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     #v3=(Null);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 156
a=0;//     .local v0, "cal":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 157
a=0;//     const/16 v1, 0xc
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 158
a=0;//     const/16 v1, 0xd
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->set(II)V
a=0;// 
a=0;//     .line 160
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private getUpBookTime()Ljava/util/Date;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/UpdateService;->getUpBookSTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 137
a=0;//     .local v3, "upBookStartTime":Ljava/util/Date;
a=0;//     #v3=(Reference,Ljava/util/Date;);
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/UpdateService;->getUpBookETime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 139
a=0;//     .local v2, "upBookEndTime":Ljava/util/Date;
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 141
a=0;//     .local v0, "cal":Ljava/util/Calendar;
a=0;//     #v0=(Reference,Ljava/util/Calendar;);
a=0;//     new-instance v4, Ljava/util/Random;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v4}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Random;);
a=0;//     invoke-virtual {v2}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v3}, Ljava/util/Date;->getTime()J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     sub-long/2addr v5, v7
a=0;// 
a=0;//     long-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 142
a=0;//     .local v1, "randomTime":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V
a=0;// 
a=0;//     .line 143
a=0;//     const/16 v4, 0xe
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v1}, Ljava/util/Calendar;->add(II)V
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/Date;);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreate()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-super {p0}, Landroid/app/Service;->onCreate()V
a=0;// 
a=0;//     .line 67
a=0;//     const-string v1, "UpdateService\u542f\u52a8\u4e86 onCreate"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-direct {p0}, Lcom/twocloo/com/cn/http/UpdateService;->getUpBookTime()Ljava/util/Date;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "upTime":Ljava/util/Date;
a=0;//     #v0=(Reference,Ljava/util/Date;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "\u7ae0\u8282\u66f4\u65b0\u65f6\u95f4|"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/DateUtils;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 76
a=0;//     new-instance v1, Lcom/twocloo/com/cn/http/UpdateService$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/http/UpdateService$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/http/UpdateService$2;-><init>(Lcom/twocloo/com/cn/http/UpdateService;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/http/UpdateService$2;);
a=0;//     invoke-static {v1, v0}, Lcom/twocloo/base/util/DateUtils;->schedule(Ljava/lang/Runnable;Ljava/util/Date;)Ljava/util/Timer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/twocloo/com/cn/http/UpdateService;->timer:Ljava/util/Timer;
a=0;// 
a=0;//     .line 92
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDestroy()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-super {p0}, Landroid/app/Service;->onDestroy()V
a=0;// 
a=0;//     .line 103
a=0;//     const-string v0, "UpdateService\u542f\u52a8\u4e86 onDestroy"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateService;->timer:Ljava/util/Timer;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     const-string v0, "\u7ae0\u8282\u66f4\u65b0\u65f6\u95f4timer\u9500\u6bc1"
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/http/UpdateService;->timer:Ljava/util/Timer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStart(Landroid/content/Intent;I)V
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "startId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V
a=0;// 
a=0;//     .line 97
a=0;//     const-string v0, "UpdateService\u542f\u52a8\u4e86 onStart"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     return-void
a=0;// .end method
}}
