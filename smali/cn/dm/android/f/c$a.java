package cn.dm.android.f; class c$a { void a() { int a;
a=0;// .class Lcn/dm/android/f/c$a;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcn/dm/android/f/c;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/f/c$a$b;,
a=0;//         Lcn/dm/android/f/c$a$c;,
a=0;//         Lcn/dm/android/f/c$a$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Lcn/dm/android/f/c$a; = null
a=0;// 
a=0;// .field private static final f:J = 0x927c0L
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/location/Location;
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     new-instance v0, Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/dm/android/f/c$a;);
a=0;//     invoke-direct {v0}, Lcn/dm/android/f/c$a;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     sput-object v0, Lcn/dm/android/f/c$a;->a:Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 645
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 649
a=0;//     #p0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     iput v0, p0, Lcn/dm/android/f/c$a;->c:I
a=0;// 
a=0;//     .line 650
a=0;//     iput v0, p0, Lcn/dm/android/f/c$a;->d:I
a=0;// 
a=0;//     .line 652
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcn/dm/android/f/c$a;->e:Z
a=0;// 
a=0;//     .line 673
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/f/c$a;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0}, Lcn/dm/android/f/c$a;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/content/Context;)Landroid/location/Location;
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/32 v8, 0x927c0
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 702
a=0;//     :try_start_0
a=0;//     #v7=(Null);
a=0;//     iget-boolean v0, p0, Lcn/dm/android/f/c$a;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 774
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/location/Location;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 707
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     const-string v0, "location"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/location/LocationManager;
a=0;// 
a=0;//     .line 709
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 711
a=0;//     const-string v1, "android.permission.ACCESS_FINE_LOCATION"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_8
a=0;// 
a=0;//     .line 713
a=0;//     const-string v1, "gps"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 717
a=0;//     :goto_1
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 718
a=0;//     const-string v1, "network"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 720
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 721
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/location/Location;->getTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     .line 723
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcn/dm/android/f/c$a;->c:I
a=0;// 
a=0;//     .line 724
a=0;//     iput-object v1, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 725
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 729
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1}, Landroid/location/Location;->getTime()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     sub-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v2, v2, v8
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     .line 730
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcn/dm/android/f/c$a;->c:I
a=0;// 
a=0;//     .line 731
a=0;//     iput-object v1, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 732
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 736
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v3, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     #v3=(Reference,Landroid/location/Location;);
a=0;//     invoke-virtual {v3}, Landroid/location/Location;->getTime()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     add-long/2addr v3, v8
a=0;// 
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_6
a=0;// 
a=0;//     .line 739
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-enter p1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 742
a=0;//     :try_start_1
a=0;//     const-string v1, "android.permission.ACCESS_COARSE_LOCATION"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_7
a=0;// 
a=0;//     .line 746
a=0;//     new-instance v1, Landroid/location/Criteria;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/location/Criteria;);
a=0;//     invoke-direct {v1}, Landroid/location/Criteria;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/location/Criteria;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAccuracy(I)V
a=0;// 
a=0;//     .line 748
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/location/Criteria;->setCostAllowed(Z)V
a=0;// 
a=0;//     .line 749
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 753
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 754
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcn/dm/android/f/c$a;->d:I
a=0;// 
a=0;//     .line 755
a=0;//     monitor-exit p1
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 757
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/location/LocationManager;);
a=0;//     new-instance v5, Lcn/dm/android/f/c$a$b;
a=0;// 
a=0;//     #v5=(UninitRef,Lcn/dm/android/f/c$a$b;);
a=0;//     invoke-direct {v5, p0, v0}, Lcn/dm/android/f/c$a$b;-><init>(Lcn/dm/android/f/c$a;Landroid/location/LocationManager;)V
a=0;// 
a=0;//     .line 759
a=0;//     #v5=(Reference,Lcn/dm/android/f/c$a$b;);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/os/Looper;);
a=0;//     invoke-virtual/range {v0 .. v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V
a=0;// 
a=0;//     .line 763
a=0;//     monitor-exit p1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 765
a=0;//     :try_start_2
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/f/c$a;->b(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 771
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcn/dm/android/f/c$a;->d:I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 772
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 763
a=0;//     :catchall_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_3
a=0;//     monitor-exit p1
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     :try_start_4
a=0;//     throw v0
a=0;// 
a=0;//     .line 773
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 774
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 767
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/location/LocationManager;);v6=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_7
a=0;//     #v1=(Integer);
a=0;//     move-object v1, v7
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_8
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     move-object v1, v7
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/f/c$a;Landroid/content/Context;)Landroid/location/Location;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/f/c$a;->a(Landroid/content/Context;)Landroid/location/Location;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static a()Lcn/dm/android/f/c$a;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 670
a=0;//     sget-object v0, Lcn/dm/android/f/c$a;->a:Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/location/Location;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 947
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 948
a=0;//     #v0=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 949
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(DoubleLo);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 954
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/f/c$a;Landroid/location/Location;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0, p1}, Lcn/dm/android/f/c$a;->a(Landroid/location/Location;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private a(IIII)V
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 840
a=0;//     #v7=(One);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 841
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v1, "version"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "1.1.0"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 842
a=0;//     const-string v1, "host"
a=0;// 
a=0;//     const-string v2, "maps.google.com"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 844
a=0;//     const-string v1, "request_address"
a=0;// 
a=0;//     invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 846
a=0;//     new-instance v1, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V
a=0;// 
a=0;//     .line 847
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 848
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v3, "cell_id"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 849
a=0;//     const-string v3, "location_area_code"
a=0;// 
a=0;//     invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 850
a=0;//     const-string v3, "mobile_country_code"
a=0;// 
a=0;//     invoke-virtual {v2, v3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 851
a=0;//     const-string v3, "mobile_network_code"
a=0;// 
a=0;//     invoke-virtual {v2, v3, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 852
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
a=0;// 
a=0;//     .line 853
a=0;//     const-string v2, "cell_towers"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 855
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V
a=0;// 
a=0;//     .line 856
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v3, "http://www.google.com/loc/json"
a=0;// 
a=0;//     invoke-direct {v2, v3}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 857
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v3, Lorg/apache/http/entity/StringEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/entity/StringEntity;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v3, v0}, Lorg/apache/http/entity/StringEntity;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 858
a=0;//     #v3=(Reference,Lorg/apache/http/entity/StringEntity;);
a=0;//     invoke-virtual {v2, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 859
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 861
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 862
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 863
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/io/InputStreamReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/InputStreamReader;);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/InputStreamReader;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 865
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 866
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 868
a=0;//     :goto_0
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 869
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 870
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 873
a=0;//     :cond_0
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 874
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     new-instance v1, Lorg/json/JSONTokener;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONTokener;);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/json/JSONTokener;);
a=0;//     invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Lorg/json/JSONTokener;)V
a=0;// 
a=0;//     .line 876
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v1, "location"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 877
a=0;//     const-string v1, "location"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "longitude"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 879
a=0;//     const-string v2, "location"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "latitude"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 881
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 882
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     new-instance v4, Landroid/location/Location;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/location/Location;);
a=0;//     const-string v5, "jizhan"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Landroid/location/Location;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 883
a=0;//     #v4=(Reference,Landroid/location/Location;);
a=0;//     invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/location/Location;->setLongitude(D)V
a=0;// 
a=0;//     .line 884
a=0;//     invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     invoke-virtual {v4, v0, v1}, Landroid/location/Location;->setLatitude(D)V
a=0;// 
a=0;//     .line 885
a=0;//     invoke-virtual {v4, v2, v3}, Landroid/location/Location;->setTime(J)V
a=0;// 
a=0;//     .line 887
a=0;//     invoke-direct {p0, v4, v7}, Lcn/dm/android/f/c$a;->a(Landroid/location/Location;I)V
a=0;// 
a=0;//     .line 891
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Landroid/location/Location;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 894
a=0;//     iput-object p1, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     .line 895
a=0;//     iput p2, p0, Lcn/dm/android/f/c$a;->c:I
a=0;// 
a=0;//     .line 896
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/f/c$a;IIII)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Lcn/dm/android/f/c$a;->a(IIII)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic a(Lcn/dm/android/f/c$a;Landroid/location/Location;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0, p1, p2}, Lcn/dm/android/f/c$a;->a(Landroid/location/Location;I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private b()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 904
a=0;//     iget v0, p0, Lcn/dm/android/f/c$a;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 914
a=0;//     :pswitch_0
a=0;//     iget v0, p0, Lcn/dm/android/f/c$a;->c:I
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 904
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static synthetic b(Lcn/dm/android/f/c$a;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0}, Lcn/dm/android/f/c$a;->c()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private b(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Lcn/dm/android/f/c$a$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/f/c$a$1;);
a=0;//     invoke-direct {v1, p0, p1}, Lcn/dm/android/f/c$a$1;-><init>(Lcn/dm/android/f/c$a;Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/f/c$a$1;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     .line 828
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 918
a=0;//     iget v0, p0, Lcn/dm/android/f/c$a;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 929
a=0;//     :pswitch_0
a=0;//     iget v0, p0, Lcn/dm/android/f/c$a;->d:I
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 918
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static synthetic c(Lcn/dm/android/f/c$a;)J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 645
a=0;//     invoke-direct {p0}, Lcn/dm/android/f/c$a;->d()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method private d()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 933
a=0;//     iget-object v0, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 934
a=0;//     iget-object v0, p0, Lcn/dm/android/f/c$a;->b:Landroid/location/Location;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/location/Location;->getTime()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 937
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/location/Location;);v1=(Uninit);
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
}}
