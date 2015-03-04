package net.slidingmenu.tools.video; class slidingccxc { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final AD_DATA:Ljava/lang/String; = "video_data"
a=0;// 
a=0;// .field public static final REQUEST_TIME:Ljava/lang/String; = "req_time"
a=0;// 
a=0;// .field private static d:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;// .field private static q:Ljava/util/HashMap;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected a:Z
a=0;// 
a=0;// .field protected final b:Ljava/lang/String;
a=0;// 
a=0;// .field protected c:Landroid/os/Handler;
a=0;// 
a=0;// .field private e:Landroid/content/Context;
a=0;// 
a=0;// .field private f:Ljava/lang/String;
a=0;// 
a=0;// .field private g:Lorg/json/JSONObject;
a=0;// 
a=0;// .field private h:I
a=0;// 
a=0;// .field private i:I
a=0;// 
a=0;// .field private j:I
a=0;// 
a=0;// .field private k:I
a=0;// 
a=0;// .field private l:Ljava/lang/String;
a=0;// 
a=0;// .field private m:Ljava/lang/String;
a=0;// 
a=0;// .field private n:I
a=0;// 
a=0;// .field private o:J
a=0;// 
a=0;// .field private p:Landroid/content/SharedPreferences;
a=0;// 
a=0;// .field private r:Lnet/slidingmenu/tools/video/slidingcbxc;
a=0;// 
a=0;// .field private s:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->i:I
a=0;// 
a=0;//     const/16 v0, -0x270f
a=0;// 
a=0;//     #v0=(Short);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     const/16 v0, 0xe10
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->k:I
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->l:Ljava/lang/String;
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->m:Ljava/lang/String;
a=0;// 
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;// 
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->a:Z
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->b()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->b:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/o;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/o;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/o;-><init>(Lnet/slidingmenu/tools/video/slidingccxc;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/o;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->c:Landroid/os/Handler;
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v1, "limit_table"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v1, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/d/a/u;->a(Ljava/lang/String;Ljava/util/HashMap;)V
a=0;// 
a=0;//     invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     mul-int/lit8 v0, v0, 0x64
a=0;// 
a=0;//     add-int/2addr v1, v0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, "date"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v2, "date"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
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
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v2, "date"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "vt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "vt"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
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
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     const-string v2, "date"
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lnet/slidingmenu/tools/video/slidingccxc;)Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a()Lnet/slidingmenu/tools/video/slidingccxc;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->d:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized a(ZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;//     .locals 2
a=0;// 
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "begin to request video ad data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     new-instance v1, Lnet/slidingmenu/tools/video/n;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/video/n;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lnet/slidingmenu/tools/video/n;-><init>(Lnet/slidingmenu/tools/video/slidingccxc;ZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/video/n;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private b()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "video"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/c/a/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lnet/slidingmenu/tools/video/slidingccxc;)Lnet/slidingmenu/tools/video/slidingcbxc;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->r:Lnet/slidingmenu/tools/video/slidingcbxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingcbxc;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private d()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/b/e;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v1}, Lnet/slidingmenu/tools/b/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     const-string v2, "lastRequestTime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     sub-long v1, v3, v1
a=0;// 
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->k:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit16 v3, v3, 0x3e8
a=0;// 
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Byte);v2=(LongHi);v3=(LongLo);v4=(LongHi);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private e()V
a=0;//     .locals 1
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/p;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/p;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/p;-><init>(Lnet/slidingmenu/tools/video/slidingccxc;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/p;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/a;->a(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Landroid/content/Context;)Lnet/slidingmenu/tools/video/slidingccxc;
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->d:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     invoke-direct {v0, p0}, Lnet/slidingmenu/tools/video/slidingccxc;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/video/slidingccxc;);
a=0;//     sput-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->d:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     :cond_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->d:Lnet/slidingmenu/tools/video/slidingccxc;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     const-string v0, "cache video data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "d"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v1, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_4
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v3, v0, v1}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-static {v1, v4, v5}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget-object v4, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v4, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     sget-object v4, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     sget-object v4, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
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
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     const-string v0, "video"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget-object v5, Lnet/slidingmenu/tools/d/a/g;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/c/a/b;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "Dir"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v5, Ljava/io/File;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v5}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     const-string v5, "zip file is exist,don\'t need to unzip"
a=0;// 
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/b/b/i/k;->b(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/16 v6, 0x64
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v5}, Lnet/slidingmenu/tools/d/a/g;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v5, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v5, v0, p1}, Lnet/slidingmenu/tools/d/a/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, "path"
a=0;// 
a=0;//     invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     const-string v0, "dpath"
a=0;// 
a=0;//     invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0, v1}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "d"
a=0;// 
a=0;//     invoke-virtual {v0, v4, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);v3=(Reference,Lorg/json/JSONArray;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Ljava/io/File;);v6=(Boolean);v7=(Uninit);
a=0;//     const-string v6, "app"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, ""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v6, v7}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v7, v6}, Lnet/slidingmenu/tools/d/a/g;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     new-instance v7, Lnet/slidingmenu/tools/video/q;
a=0;// 
a=0;//     #v7=(UninitRef,Lnet/slidingmenu/tools/video/q;);
a=0;//     invoke-direct {v7, p0, v6, v5}, Lnet/slidingmenu/tools/video/q;-><init>(Lnet/slidingmenu/tools/video/slidingccxc;Ljava/io/File;Ljava/io/File;)V
a=0;// 
a=0;//     #v7=(Reference,Lnet/slidingmenu/tools/video/q;);
a=0;//     invoke-static {v6, v4, v7}, Lnet/slidingmenu/tools/b/b/k/p;->a(Ljava/io/File;Ljava/lang/String;Lnet/slidingmenu/tools/b/b/k/a/a;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lnet/slidingmenu/tools/video/slidingccxc;->a(ZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected a(J)V
a=0;//     .locals 2
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iput-wide p1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Byte);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Landroid/content/Context;Ljava/lang/String;Z)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {p2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, -0x270f
a=0;// 
a=0;//     #v1=(Short);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "vt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "exp"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0xe10
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->k:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "sg"
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "e"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->l:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v1, "rsd"
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->m:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object p2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "video_data"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->e()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected a(Ljava/lang/String;I)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
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
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     sget-object v1, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :goto_0
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     add-int/lit8 v1, p2, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Ujava/lang/Object;);v2=(Uninit);
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "vt"
a=0;// 
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "limit_table"
a=0;// 
a=0;//     sget-object v2, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->i:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Lnet/slidingmenu/tools/video/slidingccxc;->a(ZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->e()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected a(Lnet/slidingmenu/tools/video/c;Lorg/json/JSONObject;)V
a=0;//     .locals 2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->l:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p1, Lnet/slidingmenu/tools/video/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->m:Ljava/lang/String;
a=0;// 
a=0;//     iput-object v0, p1, Lnet/slidingmenu/tools/video/c;->b:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     const-string v0, "rsd"
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     const-string v0, "e"
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->l:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public slibgsd()Z
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->c()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public slibnsd()V
a=0;//     .locals 5
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v1, "vt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->e:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->b:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Reference,Ljava/lang/Integer;);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     :cond_1
a=0;//     const-string v1, "video_data"
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->f:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     const-string v1, "adNum"
a=0;// 
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "lastShowTime"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     const-string v1, "sg"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "limit_table"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     sget-object v2, Lnet/slidingmenu/tools/video/slidingccxc;->q:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public slicbsd()V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public slicdsd()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Lnet/slidingmenu/tools/video/slidingccxc;->slicdsd(Lnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public slicdsd(Lnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;//     .locals 3
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, p1}, Lnet/slidingmenu/tools/video/slidingccxc;->a(ZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "adNum"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->p:Landroid/content/SharedPreferences;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/SharedPreferences;);
a=0;//     const-string v1, "sg"
a=0;// 
a=0;//     const/16 v2, 0xa
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     const-string v0, "your app has got video ad data"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Lnet/slidingmenu/tools/video/slidingcdxc;->slibrsd()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public slictsd(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->s:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public slidisd(Landroid/content/Context;Lnet/slidingmenu/tools/video/slidingcbxc;)V
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     const-string v0, "Your device system is below to Android 4.1 System,can not show video"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Lnet/slidingmenu/tools/b/c/b/a;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-interface {p2}, Lnet/slidingmenu/tools/video/slidingcbxc;->slibzsd()V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     invoke-direct {p0}, Lnet/slidingmenu/tools/video/slidingccxc;->d()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1, v0, p2}, Lnet/slidingmenu/tools/video/slidingccxc;->tryToShowVideo(Landroid/content/Context;ZLnet/slidingmenu/tools/video/slidingcbxc;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public tryToShowVideo(Landroid/content/Context;ZLnet/slidingmenu/tools/video/slidingcbxc;)V
a=0;//     .locals 7
a=0;// 
a=0;//     const-wide/16 v5, 0x0
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->r:Lnet/slidingmenu/tools/video/slidingcbxc;
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, v1, v5
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "lastShowTime"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     iget-wide v3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->o:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     cmp-long v3, v1, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_7
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->g:Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v2, "d"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-static {v1, v2, v3}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_9
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->i:I
a=0;// 
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->h:I
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v3, v4}, Lnet/slidingmenu/tools/b/b/b/b;->a(Lorg/json/JSONArray;ILorg/json/JSONObject;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, v1, v3}, Lnet/slidingmenu/tools/video/slidingccxc;->a(ZLnet/slidingmenu/tools/video/slidingcdxc;)V
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v3=(Integer);
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     const-class v0, Lnet/slidingmenu/tools/video/slidingcaxc;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v3, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     const-string v0, "adStr"
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_4
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/video/slidingccxc;->j:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_5
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eqz p3, :cond_5
a=0;// 
a=0;//     invoke-interface {p3}, Lnet/slidingmenu/tools/video/slidingcbxc;->slibzsd()V
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Byte);
a=0;//     const-string v1, "interruptTips"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/video/slidingccxc;->s:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v1, "dialogType"
a=0;// 
a=0;//     invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Null);v1=(LongLo);v2=(LongHi);v3=(Byte);v4=(LongHi);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-int/lit16 v3, v3, 0x3e8
a=0;// 
a=0;//     int-to-long v3, v3
a=0;// 
a=0;//     #v3=(LongLo);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_1
a=0;// 
a=0;//     const-string v0, "video ad can only be called once in the %d seconds."
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Lnet/slidingmenu/tools/video/slidingccxc;->n:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     invoke-static {v0, v1}, Lnet/slidingmenu/tools/b/c/b/a;->c(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;// 
a=0;//     if-eqz p3, :cond_6
a=0;// 
a=0;//     invoke-interface {p3}, Lnet/slidingmenu/tools/video/slidingcbxc;->slibzsd()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Byte);v1=(Boolean);v2=(Reference,Ujava/lang/Object;);v3=(Reference,Landroid/content/Intent;);v4=(Null);
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     #v0=(Null);v1=(Integer);v3=(Integer);v4=(LongHi);
a=0;//     move v1, p2
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
