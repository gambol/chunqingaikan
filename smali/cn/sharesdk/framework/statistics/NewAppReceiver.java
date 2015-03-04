package cn.sharesdk.framework.statistics; class NewAppReceiver { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// .super Landroid/content/BroadcastReceiver;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/sharesdk/framework/statistics/NewAppReceiver$b;,
a=0;//         Lcn/sharesdk/framework/statistics/NewAppReceiver$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:[Ljava/lang/String;
a=0;// 
a=0;// .field private static b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// .field private d:[Landroid/content/IntentFilter;
a=0;// 
a=0;// .field private e:Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "android.intent.action.PACKAGE_ADDED"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const-string v2, "android.intent.action.PACKAGE_CHANGED"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     const-string v2, "android.intent.action.PACKAGE_REMOVED"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     const-string v2, "android.intent.action.PACKAGE_REPLACED"
a=0;// 
a=0;//     aput-object v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->a:[Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->c:Landroid/content/Context;
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v1=(Reference,[Landroid/content/IntentFilter;);
a=0;//     new-instance v2, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/IntentFilter;);
a=0;//     aput-object v2, v1, v0
a=0;// 
a=0;//     new-instance v2, Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/IntentFilter;);
a=0;//     invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/IntentFilter;);
a=0;//     aput-object v2, v1, v5
a=0;// 
a=0;//     iput-object v1, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->d:[Landroid/content/IntentFilter;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->d:[Landroid/content/IntentFilter;
a=0;// 
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-string v2, "cn.sharesdk.START_UP"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v1, Lcn/sharesdk/framework/statistics/NewAppReceiver;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     aget-object v3, v1, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->d:[Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v4=(Reference,[Landroid/content/IntentFilter;);
a=0;//     aget-object v4, v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->d:[Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/content/IntentFilter;);
a=0;//     aget-object v0, v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "package"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->e:Landroid/os/Handler;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a()V
a=0;//     .locals 3
a=0;// 
a=0;//     const-class v1, Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_1
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->c:Landroid/content/Context;
a=0;// 
a=0;//     sget-object v2, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     #v2=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Throwable;)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static declared-synchronized a(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const-class v1, Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     invoke-direct {v0, p0}, Lcn/sharesdk/framework/statistics/NewAppReceiver;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     sput-object v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-static {}, Lcn/sharesdk/framework/statistics/NewAppReceiver;->a()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     sget-object v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     iget-object v2, v0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->d:[Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v2=(Reference,[Landroid/content/IntentFilter;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     aget-object v4, v2, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Lcn/sharesdk/framework/statistics/NewAppReceiver;->b:Lcn/sharesdk/framework/statistics/NewAppReceiver;
a=0;// 
a=0;//     #v5=(Reference,Lcn/sharesdk/framework/statistics/NewAppReceiver;);
a=0;//     invoke-virtual {p0, v5, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Throwable;)I
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget-object v2, Lcn/sharesdk/framework/statistics/NewAppReceiver;->a:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v2, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v4=(Boolean);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->c:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/statistics/NewAppReceiver$b;->a(Landroid/content/Context;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "cn.sharesdk.START_UP"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-static {p1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/utils/b;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->r()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v4, "packageName"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "========= receive broadcast: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-array v1, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->e:Landroid/os/Handler;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/statistics/NewAppReceiver;->e:Landroid/os/Handler;
a=0;// 
a=0;//     const-wide/32 v3, 0x36ee80
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v3=(Null);v4=(Uninit);
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/framework/statistics/NewAppReceiver;->a(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
