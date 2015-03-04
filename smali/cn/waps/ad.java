package cn.waps; class ad { void a() { int a;
a=0;// .class public Lcn/waps/ad;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static b:Z
a=0;// 
a=0;// .field public static c:Z
a=0;// 
a=0;// .field public static d:Ljava/lang/String;
a=0;// 
a=0;// .field static e:J
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public a:Landroid/app/Notification;
a=0;// 
a=0;// .field private f:Landroid/app/NotificationManager;
a=0;// 
a=0;// .field private g:Landroid/content/Context;
a=0;// 
a=0;// .field private h:Ljava/lang/String;
a=0;// 
a=0;// .field private i:Ljava/util/Map;
a=0;// 
a=0;// .field private final j:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput-boolean v0, Lcn/waps/ad;->b:Z
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcn/waps/ad;->c:Z
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/waps/ad;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ad;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcn/waps/ad;->h:Ljava/lang/String;
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     iput-object v0, p0, Lcn/waps/ad;->j:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     sput-wide v0, Lcn/waps/ad;->e:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/view/View;)Landroid/widget/ImageView;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     instance-of v1, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     add-int/lit8 v3, v2, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Lcn/waps/ad;->a(Landroid/view/View;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     move-object p1, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);v1=(Reference,Landroid/widget/ImageView;);v2=(Integer);v3=(Integer);
a=0;//     add-int/lit8 v1, v2, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     instance-of v1, p1, Landroid/widget/ImageView;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     check-cast p1, Landroid/widget/ImageView;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(ILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "mounted"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->j:Ljava/util/concurrent/ScheduledExecutorService;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ScheduledExecutorService;);
a=0;//     new-instance v1, Lcn/waps/ae;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/ae;);
a=0;//     iget-object v2, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, p0, v2, p2}, Lcn/waps/ae;-><init>(Lcn/waps/ad;Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/ae;);
a=0;//     const-wide/16 v2, 0x258
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v0}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const v1, 0x1080081
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     const-string v2, "downloading"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     sget-wide v1, Lcn/waps/ad;->e:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, p1, v3, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, p2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;I[Ljava/lang/Object;Ljava/lang/String;Z)V
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v6=(One);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ".apk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ".apk"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v1}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const v2, 0x1080082
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v1, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iput-object v2, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iput-wide v2, v1, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     if-eqz p5, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput v2, v1, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     iput v2, v1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(PosByte);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v1}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "android.intent.action.VIEW"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v2, 0x10000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "mounted"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "/sdcard/download/"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "application/vnd.and"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "A"
a=0;// 
a=0;//     const-string v4, "A"
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "roid.package-archive"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     :goto_2
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {v0, v2, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1, v2, p1, p4, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     :try_start_1
a=0;//     array-length v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v6, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p3, v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/Integer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aget-object v0, p3, v0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     const-string v2, "layout_inflater"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/RemoteViews;->getLayoutId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v0}, Lcn/waps/ad;->a(Landroid/view/View;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v2, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/ImageView;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2, v0, v1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     :try_start_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, p2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Reference,Landroid/app/Notification;);v2=(LongLo);v3=(LongHi);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/app/Notification;->flags:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_4
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Landroid/content/Intent;);v2=(Boolean);v3=(Reference,Ljava/lang/String;);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v2, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "application/vnd.and"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "A"
a=0;// 
a=0;//     const-string v4, "A"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, ""
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "roid.package-archive"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected b(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 5
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Landroid/app/Notification;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Notification;);
a=0;//     invoke-direct {v0}, Landroid/app/Notification;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iput-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const v1, 0x1080081
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v0, p0, Lcn/waps/ad;->i:Ljava/util/Map;
a=0;// 
a=0;//     const-string v2, "downloading"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     iput-object v0, v1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     sget-wide v1, Lcn/waps/ad;->e:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iput-wide v1, v0, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/16 v2, 0x64
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/high16 v3, 0x10000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, p1, v3, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->g:Landroid/content/Context;
a=0;// 
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/ad;->f:Landroid/app/NotificationManager;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/ad;->a:Landroid/app/Notification;
a=0;// 
a=0;//     invoke-virtual {v0, p2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
