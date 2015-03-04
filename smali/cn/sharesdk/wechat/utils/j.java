package cn.sharesdk.wechat.utils; class j { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/j;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/content/Context;
a=0;// 
a=0;// .field private b:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const-string v0, "content://com.tencent.mm.sdk.plugin.provider/sharedpref"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v2, v0, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const-string v0, "_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     const-string v0, "key"
a=0;// 
a=0;//     aput-object v0, v2, v4
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const-string v3, "type"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     const-string v3, "value"
a=0;// 
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "key = ?"
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     new-array v4, v4, [Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aput-object p1, v4, v5
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Reference,[Ljava/lang/String;);v5=(Null);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const-string v0, "value"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1}, Landroid/database/Cursor;->close()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v4=(Reference,[Ljava/lang/String;);v5=(Null);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private a([B[B)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     array-length v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, "checkSumConsistent fail, invalid arguments, \"_mmessage_checksum\" is empty"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     array-length v0, p2
a=0;// 
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v0, "checkSumConsistent fail, invalid arguments, checksum is empty"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v2=(Uninit);
a=0;//     array-length v0, p1
a=0;// 
a=0;//     array-length v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v0, v2, :cond_4
a=0;// 
a=0;//     const-string v0, "checkSumConsistent fail, length is different"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     if-ge v0, v2, :cond_6
a=0;// 
a=0;//     aget-byte v2, p1, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aget-byte v3, p2, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-eq v2, v3, :cond_5
a=0;// 
a=0;//     const-string v0, "checkSumConsistent fail, not match"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v0=(Integer);v2=(Byte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private a(Ljava/lang/String;Ljava/lang/String;I)[B
a=0;//     .locals 9
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuffer;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v2, p3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     const-string v3, "mMcShCsTr"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [C
a=0;// 
a=0;//     #v3=(Reference,[C);
a=0;//     fill-array-data v3, :array_0
a=0;// 
a=0;//     :try_start_0
a=0;//     const-string v4, "MD5"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v2, v4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     new-array v5, v2, [C
a=0;// 
a=0;//     #v5=(Reference,[C);
a=0;//     move v2, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     array-length v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v1, v6, :cond_1
a=0;// 
a=0;//     aget-byte v6, v4, v1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     add-int/lit8 v7, v2, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     ushr-int/lit8 v8, v6, 0x4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     and-int/lit8 v8, v8, 0xf
a=0;// 
a=0;//     aget-char v8, v3, v8
a=0;// 
a=0;//     #v8=(Char);
a=0;//     aput-char v8, v5, v2
a=0;// 
a=0;//     add-int/lit8 v2, v7, 0x1
a=0;// 
a=0;//     and-int/lit8 v6, v6, 0xf
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget-char v6, v3, v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     aput-char v6, v5, v7
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v5}, Ljava/lang/String;-><init>([C)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 2
a=0;//         0x30s
a=0;//         0x31s
a=0;//         0x32s
a=0;//         0x33s
a=0;//         0x34s
a=0;//         0x35s
a=0;//         0x36s
a=0;//         0x37s
a=0;//         0x38s
a=0;//         0x39s
a=0;//         0x61s
a=0;//         0x62s
a=0;//         0x63s
a=0;//         0x64s
a=0;//         0x65s
a=0;//         0x66s
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private c()Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const-string v1, "checking signature of wechat client..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "com.tencent.mm"
a=0;// 
a=0;//     const/16 v3, 0x40
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v1, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     iget-object v4, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;// 
a=0;//     #v4=(Reference,[Landroid/content/pm/Signature;);
a=0;//     aget-object v4, v4, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "308202eb30820254a00302010202044d36f7a4300d06092a864886f70d01010505003081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e74301e170d3131303131393134333933325a170d3431303131313134333933325a3081b9310b300906035504061302383631123010060355040813094775616e67646f6e673111300f060355040713085368656e7a68656e31353033060355040a132c54656e63656e7420546563686e6f6c6f6779285368656e7a68656e2920436f6d70616e79204c696d69746564313a3038060355040b133154656e63656e74204775616e677a686f7520526573656172636820616e6420446576656c6f706d656e742043656e7465723110300e0603550403130754656e63656e7430819f300d06092a864886f70d010101050003818d0030818902818100c05f34b231b083fb1323670bfbe7bdab40c0c0a6efc87ef2072a1ff0d60cc67c8edb0d0847f210bea6cbfaa241be70c86daf56be08b723c859e52428a064555d80db448cdcacc1aea2501eba06f8bad12a4fa49d85cacd7abeb68945a5cb5e061629b52e3254c373550ee4e40cb7c8ae6f7a8151ccd8df582d446f39ae0c5e930203010001300d06092a864886f70d0101050500038181009c8d9d7f2f908c42081b4c764c377109a8b2c70582422125ce545842d5f520aea69550b6bd8bfd94e987b75a3077eb04ad341f481aac266e89d3864456e69fba13df018acdc168b9a19dfd7ad9d9cc6f6ace57c746515f71234df3a053e33ba93ece5cd0fc15f3e389a3f365588a9fcb439e069d3629cd7732a13fff7b891499"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const-string v1, "pass!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Ujava/lang/Object;);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v3=(Integer);v4=(Boolean);v5=(Reference,Ljava/lang/String;);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcn/sharesdk/wechat/utils/l;)V
a=0;//     .locals 6
a=0;// 
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/wechat/utils/j;->a()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/WechatClientNotExistException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/WechatClientNotExistException;);
a=0;//     invoke-direct {v0}, Lcn/sharesdk/wechat/utils/WechatClientNotExistException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatClientNotExistException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/l;->b()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Ljava/lang/Throwable;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Throwable;);
a=0;//     const-string v1, "sendReq checkArgs fail"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const v0, 0x21030001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Lcn/sharesdk/wechat/utils/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "weixin://sendreq?appid="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcn/sharesdk/wechat/utils/j;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     new-instance v3, Landroid/content/Intent;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v3}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Intent;);
a=0;//     const-string v4, "com.tencent.mm"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "com.tencent.mm.plugin.base.stub.WXEntryActivity"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     new-instance v4, Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v4}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {p1, v4}, Lcn/sharesdk/wechat/utils/l;->a(Landroid/os/Bundle;)V
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
a=0;// 
a=0;//     :cond_2
a=0;//     const-string v4, "_mmessage_sdkVersion"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "_mmessage_appPackage"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "_mmessage_content"
a=0;// 
a=0;//     invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v4, "_mmessage_checksum"
a=0;// 
a=0;//     invoke-direct {p0, v2, v1, v0}, Lcn/sharesdk/wechat/utils/j;->a(Ljava/lang/String;Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v0, 0x10000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     const/high16 v0, 0x8000000
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/wechat/utils/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     const-string v0, "starting activity, packageName=com.tencent.mm, className=com.tencent.mm.plugin.base.stub.WXEntryActivity"
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a()Z
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcn/sharesdk/wechat/utils/j;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);
a=0;//     const-string v1, "_build_info_sdk_int_"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Lcn/sharesdk/wechat/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     const v2, 0x21030001
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/String;);v2=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Lcn/sharesdk/wechat/utils/j;->a:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/sharesdk/wechat/utils/j;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/sharesdk/wechat/utils/j;->c()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const-string v1, "register app failed for wechat app signature check failed"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     const-string v1, "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "weixin://registerapp?appid="
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "com.tencent.mm.permission.MM_MESSAGE"
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const v5, 0x21040001
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     new-instance v6, Landroid/content/Intent;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v6, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "_mmessage_sdkVersion"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v7, "_mmessage_appPackage"
a=0;// 
a=0;//     invoke-virtual {v6, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v7, "_mmessage_content"
a=0;// 
a=0;//     invoke-virtual {v6, v7, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     const-string v7, "_mmessage_checksum"
a=0;// 
a=0;//     invoke-direct {p0, v2, v4, v5}, Lcn/sharesdk/wechat/utils/j;->a(Ljava/lang/String;Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v6, v7, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {p1, v6, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "sending broadcast, intent="
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ", perm="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-array v0, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v0}, Lcn/sharesdk/framework/utils/e;->a(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Lcn/sharesdk/wechat/utils/WechatHandlerActivity;Lcn/sharesdk/wechat/utils/k;)Z
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     const-string v2, "wx_token_key"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     const-string v3, "com.tencent.mm.openapi.token"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v1, "invalid argument, \"wx_token_key\" is empty or does not equals \"com.tencent.mm.openapi.token\""
a=0;// 
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "_mmessage_appPackage"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     const-string v1, "invalid argument, \"_mmessage_appPackage\" is empty"
a=0;// 
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     const-string v3, "_mmessage_content"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "_mmessage_sdkVersion"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const-string v5, "_mmessage_checksum"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {p0, v3, v2, v4}, Lcn/sharesdk/wechat/utils/j;->a(Ljava/lang/String;Ljava/lang/String;I)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {p0, v5, v2}, Lcn/sharesdk/wechat/utils/j;->a([B[B)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     const-string v1, "checksum fail"
a=0;// 
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-static {v1, v2}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Object;[Ljava/lang/Object;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "_wxapi_command_type"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_0
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/b;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/b;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/wechat/utils/b;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/b;);
a=0;//     invoke-virtual {p2, v0}, Lcn/sharesdk/wechat/utils/k;->a(Lcn/sharesdk/wechat/utils/WechatResp;)V
a=0;// 
a=0;//     :goto_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/e;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/e;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/wechat/utils/e;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/e;);
a=0;//     invoke-virtual {p2, v0}, Lcn/sharesdk/wechat/utils/k;->a(Lcn/sharesdk/wechat/utils/WechatResp;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/c;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/c;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/wechat/utils/c;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/c;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/wechat/utils/c;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->onGetMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Null);
a=0;//     new-instance v0, Lcn/sharesdk/wechat/utils/f;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/wechat/utils/f;);
a=0;//     invoke-direct {v0, v1}, Lcn/sharesdk/wechat/utils/f;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/f;);
a=0;//     iget-object v0, v0, Lcn/sharesdk/wechat/utils/f;->a:Lcn/sharesdk/wechat/utils/WXMediaMessage;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->onShowMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 2
a=0;// 
a=0;//     const-string v0, "_build_info_sdk_int_"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Lcn/sharesdk/wechat/utils/j;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     const v1, 0x21020001
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->c(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
}}
