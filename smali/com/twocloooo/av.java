package com.twocloooo; class av { void a() { int a;
a=0;// .class public Lcom/twocloooo/av;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:I
a=0;// 
a=0;// .field private static n:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/content/Context;
a=0;// 
a=0;// .field private c:Ljava/util/LinkedList;
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:I
a=0;// 
a=0;// .field private f:[Lcom/twocloooo/aw;
a=0;// 
a=0;// .field private g:Ljava/io/File;
a=0;// 
a=0;// .field private h:Ljava/util/Map;
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:Ljava/lang/String;
a=0;// 
a=0;// .field private k:Ljava/lang/String;
a=0;// 
a=0;// .field private l:Landroid/app/Notification;
a=0;// 
a=0;// .field private m:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private o:I
a=0;// 
a=0;// .field private p:Ljava/lang/String;
a=0;// 
a=0;// .field private q:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x2710
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     sput v0, Lcom/twocloooo/av;->a:I
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput v0, Lcom/twocloooo/av;->n:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/av;);
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloooo/av;->d:I
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ConcurrentHashMap;);
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     iput v1, p0, Lcom/twocloooo/av;->q:I
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/av;->j:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloooo/av;->k:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     iput p5, p0, Lcom/twocloooo/av;->q:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a()Ljava/lang/Boolean;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/net/URL;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     const/16 v3, 0x7530
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     const-string v3, "GET"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v3, "Accept-Encoding"
a=0;// 
a=0;//     const-string v4, "identity"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3, v4}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v3}, Ljava/net/HttpURLConnection;->setFollowRedirects(Z)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     if-gtz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const-string v0, "\u7f51\u7edc\u5f02\u5e38"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(One);v3=(Integer);v4=(PosShort);
a=0;//     move v0, v2
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v2, 0x194
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     if-ne v0, v2, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const-string v0, "\u8d44\u6e90\u6682\u65f6\u4e0d\u5b58\u5728"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(PosShort);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     const-string v0, "\u7f51\u7edc\u5f02\u5e38"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-string v0, "\u7f51\u7edc\u5f02\u5e38"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Boolean;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v3=(Integer);v4=(PosShort);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/app/Notification;Ljava/io/File;)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const/high16 v1, 0x4000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {p2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "application/vnd.android.package-archive"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2, v3, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "com.android.internal.R$id"
a=0;// 
a=0;//     const-string v3, "text"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloooo/av;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "\u70b9\u51fb\u5b89\u88c5"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     const v0, 0x1080082
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->m:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     iget v1, p0, Lcom/twocloooo/av;->o:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected declared-synchronized a(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lcom/twocloooo/av;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloooo/av;->d:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized a(IILcom/twocloooo/ax;)V
a=0;//     .locals 3
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method a(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "com.android.internal.R$id"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "text"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloooo/av;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     sget v3, Lcom/twocloooo/av;->a:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v4, v3, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sput v4, Lcom/twocloooo/av;->a:I
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v3, v0, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->m:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloooo/av;->o:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(I)Z
a=0;//     .locals 12
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Lcom/twocloooo/be;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "/download"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "/"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/download"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->m:Landroid/app/NotificationManager;
a=0;// 
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     const v1, 0x1080082
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ",\u51c6\u5907\u4e0b\u8f7d!"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     sget v0, Lcom/twocloooo/av;->n:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, v0, 0x1
a=0;// 
a=0;//     sput v1, Lcom/twocloooo/av;->n:I
a=0;// 
a=0;//     iput v0, p0, Lcom/twocloooo/av;->o:I
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     const-string v3, "\u6b63\u5728\u7b49\u5f85\u4e0b\u8f7d"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v5}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const-string v0, "\u6b63\u5728\u7b49\u5f85\u4e0b\u8f7d"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-array v0, p1, [Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v10, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->g:Ljava/io/File;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/twocloooo/av;->a()Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     rem-int/2addr v0, v1
a=0;// 
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     iput v0, p0, Lcom/twocloooo/av;->i:I
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/RandomAccessFile;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/RandomAccessFile;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->g:Ljava/io/File;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const-string v2, "rw"
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/RandomAccessFile;);
a=0;//     iget v1, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/io/RandomAccessFile;->setLength(J)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
a=0;// 
a=0;//     new-instance v2, Ljava/net/URL;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/net/URL;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->j:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/URL;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->clear()V
a=0;// 
a=0;//     move v0, v8
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_9
a=0;// 
a=0;//     :cond_3
a=0;//     move v9, v8
a=0;// 
a=0;//     :goto_2
a=0;//     #v5=(Integer);v6=(Conflicted);v9=(Integer);v11=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v9, v0, :cond_a
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "threadDownSize"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloooo/bm;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     new-instance v0, Lcom/twocloooo/ax;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/ax;);
a=0;//     invoke-direct {v0}, Lcom/twocloooo/ax;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/ax;);
a=0;//     const-string v1, "pack"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Lcom/twocloooo/ax;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "threadDownSize"
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-static {v3}, Lcom/twocloooo/bm;->a(Ljava/util/Collection;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v1, v3}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v7
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
a=0;//     if-nez v0, :cond_c
a=0;// 
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v10, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->l:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     invoke-direct {p0, v1, v0}, Lcom/twocloooo/av;->a(Landroid/app/Notification;Ljava/io/File;)V
a=0;// 
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "threadDownSize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloooo/bm;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/util/LinkedList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     move v1, v8
a=0;// 
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_11
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move v8, v7
a=0;// 
a=0;//     :cond_7
a=0;//     :goto_6
a=0;//     #v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);
a=0;//     return v8
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(LongHi);v5=(Null);v6=(Uninit);v8=(Null);v9=(Uninit);v11=(Uninit);
a=0;//     iget v0, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/2addr v0, v1
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_9
a=0;//     :try_start_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     add-int/lit8 v3, v0, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v9=(Integer);v11=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     add-int/lit8 v1, v9, 0x1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloooo/av;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_b
a=0;// 
a=0;//     iget v0, p0, Lcom/twocloooo/av;->d:I
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     if-ge v0, v1, :cond_b
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v11=(Reference,[Lcom/twocloooo/aw;);
a=0;//     new-instance v0, Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/aw;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->g:Ljava/io/File;
a=0;// 
a=0;//     iget v4, p0, Lcom/twocloooo/av;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     add-int/lit8 v5, v9, 0x1
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v6, v9, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloooo/aw;-><init>(Lcom/twocloooo/av;Ljava/net/URL;Ljava/io/File;III)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/aw;);
a=0;//     aput-object v0, v11, v9
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     aget-object v0, v0, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/aw;->setPriority(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);
a=0;//     aget-object v0, v0, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/aw;->start()V
a=0;// 
a=0;//     :goto_7
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);v4=(Conflicted);v6=(Conflicted);v11=(Conflicted);
a=0;//     add-int/lit8 v0, v9, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v9, v0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput-object v1, v0, v9
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     const-string v0, "\u4e0b\u8f7d\u4e2d\u65ad"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Reference,Ljava/net/URL;);v5=(Integer);v9=(Integer);
a=0;//     const-wide/16 v0, 0x3e8
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
a=0;// 
a=0;//     move v9, v8
a=0;// 
a=0;//     #v9=(Null);
a=0;//     move v0, v8
a=0;// 
a=0;//     :goto_8
a=0;//     #v0=(Boolean);v1=(Conflicted);v9=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v9, v1, :cond_d
a=0;// 
a=0;//     iget v1, p0, Lcom/twocloooo/av;->d:I
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v3, 0x3f800000    # 1.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v1, v3
a=0;// 
a=0;//     iget v3, p0, Lcom/twocloooo/av;->e:I
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     div-float/2addr v1, v3
a=0;// 
a=0;//     const/high16 v3, 0x42c80000    # 100.0f
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_10
a=0;// 
a=0;//     const-string v3, "\u5df2\u7ecf\u4e0b\u8f7d%d%%"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     new-array v4, v4, [Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v1, v4, v5
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->p:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p0, v1, v3}, Lcom/twocloooo/av;->a(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_d
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     aget-object v1, v1, v9
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v1=(Reference,[Lcom/twocloooo/aw;);
a=0;//     aget-object v1, v1, v9
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Lcom/twocloooo/aw;->a()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_f
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);
a=0;//     aget-object v0, v0, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/aw;->b()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v3, -0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v0, v0, v3
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_e
a=0;// 
a=0;//     iget-object v11, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v11=(Reference,[Lcom/twocloooo/aw;);
a=0;//     new-instance v0, Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloooo/aw;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/av;->g:Ljava/io/File;
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     iget v4, p0, Lcom/twocloooo/av;->i:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v1, p0, Lcom/twocloooo/av;->h:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     add-int/lit8 v5, v9, 0x1
a=0;// 
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v6, v9, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloooo/aw;-><init>(Lcom/twocloooo/av;Ljava/net/URL;Ljava/io/File;III)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/aw;);
a=0;//     aput-object v0, v11, v9
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     aget-object v0, v0, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloooo/aw;->setPriority(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->f:[Lcom/twocloooo/aw;
a=0;// 
a=0;//     #v0=(Reference,[Lcom/twocloooo/aw;);
a=0;//     aget-object v0, v0, v9
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/aw;->start()V
a=0;// 
a=0;//     :cond_e
a=0;//     #v0=(Byte);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v11=(Conflicted);
a=0;//     move v0, v7
a=0;// 
a=0;//     :cond_f
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 v1, v9, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v9, v1
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     :cond_10
a=0;//     #v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     iget v3, p0, Lcom/twocloooo/av;->q:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq v3, v4, :cond_5
a=0;// 
a=0;//     sput v1, Lcom/twocloooo/DevNativeService;->f:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     :cond_11
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/ax;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/ax;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/av;->b:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "threadDownSize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/av;->c:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloooo/bm;->a(Ljava/util/Collection;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lcom/twocloooo/bm;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     :cond_12
a=0;//     #v0=(Boolean);v1=(Integer);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto/16 :goto_4
a=0;// .end method
}}
