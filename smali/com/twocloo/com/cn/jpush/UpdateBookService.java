package com.twocloo.com.cn.jpush; class UpdateBookService { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/jpush/UpdateBookService;
a=0;// .super Landroid/app/Service;
a=0;// .source "UpdateBookService.java"
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
a=0;// .field private db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;// .field private handler:Landroid/os/Handler;
a=0;// 
a=0;// .field mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private messageInfo:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-direct {p0}, Landroid/app/Service;-><init>()V
a=0;// 
a=0;//     .line 41
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->messageInfo:Ljava/lang/String;
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 43
a=0;//     new-instance v0, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/jpush/UpdateBookService$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/com/cn/jpush/UpdateBookService$1;-><init>(Lcom/twocloo/com/cn/jpush/UpdateBookService;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService$1;);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Lcom/twocloo/com/cn/db/DBAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/db/DBAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->messageInfo:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$2(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->messageInfo:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$3(Lcom/twocloo/com/cn/jpush/UpdateBookService;Lcom/twocloo/com/cn/db/DBAdapter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->db:Lcom/twocloo/com/cn/db/DBAdapter;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$4(Lcom/twocloo/com/cn/jpush/UpdateBookService;Ljava/util/HashMap;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/jpush/UpdateBookService;->cg(Ljava/util/HashMap;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$5(Lcom/twocloo/com/cn/jpush/UpdateBookService;)Landroid/os/Handler;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->handler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private cg(Ljava/util/HashMap;)Ljava/lang/String;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Long;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     .local p1, "mp":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Long;>;"
a=0;//     invoke-virtual {p1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 155
a=0;//     .local v1, "set":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     .line 156
a=0;//     .local v2, "st":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 157
a=0;//     .local v0, "buff":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 164
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 157
a=0;//     :cond_1
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 158
a=0;//     .local v3, "string":Ljava/lang/String;
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 159
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     const-string v2, ","
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onStartCommand(Landroid/content/Intent;II)I
a=0;//     .locals 2
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;//     .param p2, "flags"    # I
a=0;//     .param p3, "startId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/jpush/UpdateBookService$2;);
a=0;//     invoke-direct {v1, p0}, Lcom/twocloo/com/cn/jpush/UpdateBookService$2;-><init>(Lcom/twocloo/com/cn/jpush/UpdateBookService;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/jpush/UpdateBookService$2;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 148
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 150
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public sendNotification(Landroid/content/Context;ILjava/lang/String;I)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "messageInfo"    # Ljava/lang/String;
a=0;//     .param p4, "count"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     .local v1, "intent":Landroid/content/Intent;
a=0;//     #v1=(Null);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     .end local v1    # "intent":Landroid/content/Intent;
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v3, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v1, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 174
a=0;//     .restart local v1    # "intent":Landroid/content/Intent;
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v3, "id"
a=0;// 
a=0;//     sget v4, Lcom/twocloo/com/cn/R$id;->main_bookshelf:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 175
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     const-string v3, "notification"
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v3, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     new-instance v2, Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/app/Notification;);
a=0;//     sget v3, Lcom/twocloo/com/cn/R$drawable;->icon:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v2, v3, p3, v4, v5}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     .line 179
a=0;//     .local v2, "notification":Landroid/app/Notification;
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     iput v3, v2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 181
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput v3, v2, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     .line 182
a=0;//     const/high16 v3, 0x8000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1, p2, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     .local v0, "contentIntent":Landroid/app/PendingIntent;
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u4e8c\u5c42\u697c\u4e66\u9662:"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\u672c\u4e66\u6709\u66f4\u65b0"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, p1, v3, p3, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/jpush/UpdateBookService;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v3, p2, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// .end method
}}
