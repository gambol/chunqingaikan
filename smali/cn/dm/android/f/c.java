package cn.dm.android.f; class c { void a() { int a;
a=0;// .class public Lcn/dm/android/f/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcn/dm/android/f/c$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static b:I = 0x0
a=0;// 
a=0;// .field private static c:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static d:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static e:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static f:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static g:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static h:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static i:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static j:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static k:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static l:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static m:F = 0.0f
a=0;// 
a=0;// .field private static n:F = 0.0f
a=0;// 
a=0;// .field private static o:I = 0x0
a=0;// 
a=0;// .field private static p:I = 0x0
a=0;// 
a=0;// .field private static q:I = 0x0
a=0;// 
a=0;// .field private static r:I = 0x0
a=0;// 
a=0;// .field private static s:Ljava/lang/String; = null
a=0;// 
a=0;// .field private static final t:Ljava/lang/String; = "sdk"
a=0;// 
a=0;// .field private static final u:Ljava/lang/String; = "unknown"
a=0;// 
a=0;// .field private static final v:Ljava/lang/String; = "gprs"
a=0;// 
a=0;// .field private static final w:Ljava/lang/String; = "wifi"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 645
a=0;//     #p0=(Reference,Lcn/dm/android/f/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static A(Landroid/content/Context;)Landroid/database/Cursor;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 577
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->q(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 578
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "wifi"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 587
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Landroid/database/Cursor;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 582
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v0, "content://telephony/carriers/preferapn"
a=0;// 
a=0;//     .line 583
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 584
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static B(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     invoke-static {}, Lcn/dm/android/f/c$a;->a()Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 598
a=0;//     #v0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     invoke-static {v0, p0}, Lcn/dm/android/f/c$a;->a(Lcn/dm/android/f/c$a;Landroid/content/Context;)Landroid/location/Location;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 599
a=0;//     #v1=(Reference,Landroid/location/Location;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 600
a=0;//     invoke-static {v0, v1}, Lcn/dm/android/f/c$a;->a(Lcn/dm/android/f/c$a;Landroid/location/Location;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 603
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static C(Landroid/content/Context;)Landroid/net/wifi/ScanResult;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 965
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 966
a=0;//     #v1=(Null);
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     .line 967
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 968
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 969
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 970
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/ScanResult;
a=0;// 
a=0;//     .line 972
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static D(Landroid/content/Context;)[J
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 1002
a=0;//     #v8=(One);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v3, v0, [J
a=0;// 
a=0;//     .line 1003
a=0;//     #v3=(Reference,[J);
a=0;//     const-string v0, "activity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/ActivityManager;
a=0;// 
a=0;//     .line 1005
a=0;//     new-instance v4, Landroid/app/ActivityManager$MemoryInfo;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/app/ActivityManager$MemoryInfo;);
a=0;//     invoke-direct {v4}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V
a=0;// 
a=0;//     .line 1006
a=0;//     #v4=(Reference,Landroid/app/ActivityManager$MemoryInfo;);
a=0;//     invoke-virtual {v0, v4}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V
a=0;// 
a=0;//     .line 1007
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 1008
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v4, v4, Landroid/app/ActivityManager$MemoryInfo;->availMem:J
a=0;// 
a=0;//     .line 1009
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-string v0, "/proc/meminfo"
a=0;// 
a=0;//     .line 1013
a=0;//     :try_start_0
a=0;//     new-instance v6, Ljava/io/FileReader;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v6, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1014
a=0;//     #v6=(Reference,Ljava/io/FileReader;);
a=0;//     new-instance v7, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     const/16 v0, 0x2000
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {v7, v6, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
a=0;// 
a=0;//     .line 1016
a=0;//     #v7=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1017
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "\\s+"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1018
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     aget-object v0, v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit16 v0, v0, 0x400
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     .line 1019
a=0;//     :try_start_1
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 1024
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aput-wide v0, v3, v2
a=0;// 
a=0;//     .line 1026
a=0;//     aput-wide v4, v3, v8
a=0;// 
a=0;//     .line 1027
a=0;//     return-object v3
a=0;// 
a=0;//     .line 1020
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(LongLo);v2=(LongHi);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     move-object v9, v0
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/IOException;);
a=0;//     move-wide v10, v1
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     move-wide v0, v10
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-object v2, v9
a=0;// 
a=0;//     .line 1021
a=0;//     :goto_1
a=0;//     #v2=(Reference,Ljava/io/IOException;);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1020
a=0;//     :catch_1
a=0;//     #v2=(LongHi);v6=(One);v7=(Reference,Ljava/io/BufferedReader;);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static E(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1067
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 1070
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 1072
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1078
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1073
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 1075
a=0;//     const-string v0, "0"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1078
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static F(Landroid/content/Context;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v2, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sput-object v2, Lcn/dm/android/f/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 102
a=0;//     iget v2, v1, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sput v2, Lcn/dm/android/f/c;->b:I
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     sput-object v1, Lcn/dm/android/f/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     iget v1, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I
a=0;// 
a=0;//     .line 110
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->labelRes:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/dm/android/f/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 114
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(PosShort);
a=0;//     iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     sput-object v0, Lcn/dm/android/f/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 118
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :cond_3
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);v2=(PosShort);
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static a()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 440
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Enumeration;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 441
a=0;//     invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/net/NetworkInterface;
a=0;// 
a=0;//     .line 443
a=0;//     invoke-virtual {v0}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 444
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/util/Enumeration;);
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 445
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/net/InetAddress;
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v0}, Ljava/net/InetAddress;->isLoopbackAddress()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 455
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 452
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 455
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     sget-object v0, Lcn/dm/android/f/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 124
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->F(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a(IZ)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 630
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 631
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, p0, :cond_1
a=0;// 
a=0;//     .line 640
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 634
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 637
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Uninit);
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-gt v2, p0, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 640
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 233
a=0;//     #v0=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 237
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 240
a=0;//     :catch_0
a=0;//     #v0=(One);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static b(Landroid/content/Context;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     sget-object v0, Lcn/dm/android/f/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->F(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     sget v0, Lcn/dm/android/f/c;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static b()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     new-instance v0, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v1, "Z"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 460
a=0;//     #v0=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v1, Ljava/util/Date;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v1}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static c()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     invoke-static {}, Lcn/dm/android/f/c$a;->a()Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     invoke-static {v0}, Lcn/dm/android/f/c$a;->a(Lcn/dm/android/f/c$a;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static c(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     sget-object v0, Lcn/dm/android/f/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->F(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static d()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 611
a=0;//     invoke-static {}, Lcn/dm/android/f/c$a;->a()Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     invoke-static {v0}, Lcn/dm/android/f/c$a;->b(Lcn/dm/android/f/c$a;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static d(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     sget-object v0, Lcn/dm/android/f/c;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 148
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->F(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->d:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static e()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 615
a=0;//     invoke-static {}, Lcn/dm/android/f/c$a;->a()Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     invoke-static {v0}, Lcn/dm/android/f/c$a;->c(Lcn/dm/android/f/c$a;)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method protected static e(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     const-string v0, "_"
a=0;// 
a=0;//     .line 157
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v0, Lcn/dm/android/f/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 158
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 161
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 162
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 165
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 168
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_3
a=0;// 
a=0;//     .line 169
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ","
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 174
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 177
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 181
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     const-string v2, ","
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 184
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 187
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 190
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 191
a=0;//     const-string v2, ","
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "_"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 193
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 196
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 198
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     .line 204
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/f/c;->l:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/StringBuffer;);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "1.5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static f()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 983
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/FileReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileReader;);
a=0;//     const-string v1, "/proc/cpuinfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 984
a=0;//     #v0=(Reference,Ljava/io/FileReader;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 985
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 986
a=0;//     const-string v2, ":\\s+"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 987
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     .line 988
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v0, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 992
a=0;//     :goto_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 989
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 990
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 992
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static f(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     invoke-static {p0}, Lcn/dm/android/f/i;->a(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 215
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 218
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 220
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static g(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     sget-object v0, Lcn/dm/android/f/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->h(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 251
a=0;//     const-string v0, "-1,-1,emulator"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/dm/android/f/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     .line 257
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->k(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/dm/android/f/c;->e:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static g()[J
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 1037
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v1, v0, [J
a=0;// 
a=0;//     .line 1039
a=0;//     #v1=(Reference,[J);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1042
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1048
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v2, Landroid/os/StatFs;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1050
a=0;//     #v2=(Reference,Landroid/os/StatFs;);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getBlockSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v3, v0
a=0;// 
a=0;//     .line 1052
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getBlockCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-long v5, v0
a=0;// 
a=0;//     .line 1054
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v2}, Landroid/os/StatFs;->getAvailableBlocks()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     int-to-long v7, v0
a=0;// 
a=0;//     .line 1056
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     mul-long/2addr v5, v3
a=0;// 
a=0;//     aput-wide v5, v1, v0
a=0;// 
a=0;//     .line 1057
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     mul-long v2, v7, v3
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     aput-wide v2, v1, v0
a=0;// 
a=0;//     .line 1058
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1045
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static h()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1088
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v3, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     const-string v2, "/system/bin/"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     const-string v2, "/system/xbin/"
a=0;// 
a=0;//     aput-object v2, v3, v0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const-string v4, "/system/sbin/"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     const-string v4, "/sbin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     const-string v4, "/vendor/bin/"
a=0;// 
a=0;//     aput-object v4, v3, v2
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 1091
a=0;//     :goto_0
a=0;//     :try_start_0
a=0;//     #v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v2, v4, :cond_1
a=0;// 
a=0;//     .line 1092
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     aget-object v6, v3, v2
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "su"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1093
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/File;->exists()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1099
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1091
a=0;//     :cond_0
a=0;//     #v0=(One);v5=(Reference,Ljava/lang/String;);v6=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1097
a=0;//     :catch_0
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 1099
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected static h(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     sget-object v0, Lcn/dm/android/f/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->n(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->j(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "sdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static i(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->j(Landroid/content/Context;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v0, "sdk"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static j(Landroid/content/Context;)Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->l(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 276
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 277
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 281
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 279
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v1, "0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
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
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static k(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     new-instance v1, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 287
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/StringBuffer;);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->l(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 293
a=0;//     :goto_0
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 295
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 298
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 303
a=0;//     :goto_1
a=0;//     const-string v0, ","
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 308
a=0;//     :goto_2
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->n(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 309
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 310
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 314
a=0;//     :goto_3
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 291
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 304
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/SecurityException;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 301
a=0;//     :cond_1
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 305
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 312
a=0;//     :cond_2
a=0;//     const-string v0, "-1"
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method protected static l(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 320
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 322
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->f:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 327
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->f:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 324
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static m(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 333
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->g:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->g:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 337
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static n(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "android_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->h:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 354
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/f/c;->h:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 351
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static o(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     sget-object v0, Lcn/dm/android/f/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 365
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 366
a=0;//     sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     .line 372
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/f/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 368
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v0, "1.5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/dm/android/f/c;->i:Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static p(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 382
a=0;//     sget-object v0, Lcn/dm/android/f/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "_"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/f/c;->j:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static q(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     const-string v0, "android.permission.ACCESS_NETWORK_STATE"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 400
a=0;//     const-string v0, "unknown"
a=0;// 
a=0;//     .line 419
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 403
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Byte);
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 407
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 408
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 409
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 410
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 411
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 414
a=0;//     const-string v0, "gprs"
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 415
a=0;//     :cond_2
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v1, v0, :cond_3
a=0;// 
a=0;//     .line 416
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 419
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "unknown"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static r(Landroid/content/Context;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 427
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 429
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 431
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 433
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 431
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 432
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 433
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static s(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     :try_start_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 472
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 474
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcn/dm/android/f/c;->k:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 479
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     sget-object v0, Lcn/dm/android/f/c;->k:Ljava/lang/String;
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 476
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static t(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     const-string v0, "v"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/dm/android/f/c;->s:Ljava/lang/String;
a=0;// 
a=0;//     .line 490
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 492
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-eq v1, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 494
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     const-string v0, "h"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/dm/android/f/c;->s:Ljava/lang/String;
a=0;// 
a=0;//     .line 497
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcn/dm/android/f/c;->s:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected static u(Landroid/content/Context;)F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 509
a=0;//     :try_start_0
a=0;//     sget v0, Lcn/dm/android/f/c;->m:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 510
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 513
a=0;//     new-instance v1, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 514
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 515
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcn/dm/android/f/c;->m:F
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 520
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget v0, Lcn/dm/android/f/c;->m:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 517
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static v(Landroid/content/Context;)F
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     :try_start_0
a=0;//     sget v0, Lcn/dm/android/f/c;->n:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 532
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 534
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcn/dm/android/f/c;->n:F
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 539
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget v0, Lcn/dm/android/f/c;->n:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 536
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static w(Landroid/content/Context;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->y(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->u(Landroid/content/Context;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->v(Landroid/content/Context;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcn/dm/android/f/c;->o:I
a=0;// 
a=0;//     .line 546
a=0;//     sget v0, Lcn/dm/android/f/c;->o:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static x(Landroid/content/Context;)I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 550
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->z(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->u(Landroid/content/Context;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {p0}, Lcn/dm/android/f/c;->v(Landroid/content/Context;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float/2addr v1, v2
a=0;// 
a=0;//     mul-float/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcn/dm/android/f/c;->p:I
a=0;// 
a=0;//     .line 553
a=0;//     sget v0, Lcn/dm/android/f/c;->p:I
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static y(Landroid/content/Context;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 559
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcn/dm/android/f/c;->q:I
a=0;// 
a=0;//     .line 563
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sget v0, Lcn/dm/android/f/c;->q:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected static z(Landroid/content/Context;)I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     const-string v0, "window"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/WindowManager;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 569
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 570
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcn/dm/android/f/c;->r:I
a=0;// 
a=0;//     .line 573
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     sget v0, Lcn/dm/android/f/c;->r:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
