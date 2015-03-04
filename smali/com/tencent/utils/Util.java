package com.tencent.utils; class Util { void a() { int a;
a=0;// .class public Lcom/tencent/utils/Util;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/utils/Util$TBufferedOutputStream;,
a=0;//         Lcom/tencent/utils/Util$Statistic;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// .field private static b:Z
a=0;// 
a=0;// .field private static c:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     const-class v0, Lcom/tencent/utils/Util;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/utils/Util;->a:Ljava/lang/String;
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     sput-boolean v0, Lcom/tencent/utils/Util;->b:Z
a=0;// 
a=0;//     .line 769
a=0;//     const-string v0, "0123456789ABCDEF"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/tencent/utils/Util;->c:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 226
a=0;//     #p0=(Reference,Lcom/tencent/utils/Util;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(I)C
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 690
a=0;//     and-int/lit8 v0, p0, 0xf
a=0;// 
a=0;//     .line 692
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 693
a=0;//     add-int/lit8 v0, v0, 0x30
a=0;// 
a=0;//     int-to-char v0, v0
a=0;// 
a=0;//     .line 696
a=0;//     :goto_0
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// 
a=0;//     .line 695
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0xa
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x61
a=0;// 
a=0;//     int-to-char v0, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/IllegalStateException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 371
a=0;//     #v5=(Byte);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 372
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 374
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 375
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 377
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v0, "Content-Encoding"
a=0;// 
a=0;//     invoke-interface {p0, v0}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 378
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "gzip"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v5, :cond_1
a=0;// 
a=0;//     .line 380
a=0;//     new-instance v0, Ljava/util/zip/GZIPInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPInputStream;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V
a=0;// 
a=0;//     .line 384
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v3=(Conflicted);
a=0;//     const/16 v1, 0x200
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 385
a=0;//     :goto_1
a=0;//     #v1=(Reference,[B);v4=(Conflicted);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v3, v5, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     .line 389
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/InputStream;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v0}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     .line 614
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/ComponentName;);
a=0;//     invoke-direct {v1, p1, p2}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 615
a=0;//     const-string v1, "android.intent.action.VIEW"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 616
a=0;//     const/high16 v1, 0x40000000    # 2.0f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 617
a=0;//     const/high16 v1, 0x10000000
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 619
a=0;//     invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 621
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 623
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 518
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const-string v2, "com.tencent.mtt"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x40
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 520
a=0;//     iget-object v2, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     .line 521
a=0;//     const-string v3, "4.3"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lcom/tencent/utils/SystemUtils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     const-string v3, "4.4"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 523
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 524
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 527
a=0;//     :try_start_1
a=0;//     const-string v2, "MD5"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v1, v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 529
a=0;//     invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->toHexString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 530
a=0;//     invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V
a=0;// 
a=0;//     .line 532
a=0;//     const-string v2, "d8391a394d4a179e6fe7bdb8a301258b"
a=0;// 
a=0;//     .line 533
a=0;//     const-string v2, "d8391a394d4a179e6fe7bdb8a301258b"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 534
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 545
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 536
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Ljava/lang/Object;);v3=(Reference,Ljava/lang/String;);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 538
a=0;//     :try_start_2
a=0;//     invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 542
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 145
a=0;//     #v1=(Null);
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 146
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 147
a=0;//     const-string v0, "&"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 148
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     array-length v4, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     aget-object v5, v3, v0
a=0;// 
a=0;//     .line 149
a=0;//     #v5=(Null);
a=0;//     const-string v6, "="
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 150
a=0;//     #v5=(Reference,[Ljava/lang/String;);
a=0;//     array-length v6, v5
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_0
a=0;// 
a=0;//     .line 151
a=0;//     aget-object v6, v5, v1
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     aget-object v5, v5, v7
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-static {v5}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(PosByte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 156
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static decodeUrlToJson(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 161
a=0;//     new-instance p0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #p0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     #p0=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 163
a=0;//     const-string v1, "&"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 164
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     aget-object v0, v2, v1
a=0;// 
a=0;//     .line 165
a=0;//     #v0=(Null);
a=0;//     const-string v4, "="
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 166
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v4=(Null);
a=0;//     aget-object v4, v0, v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     aget-object v0, v0, v5
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 164
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(PosByte);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v4=(Reference,Ljava/lang/String;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 176
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public static encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 100
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 84
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0}, Landroid/os/Bundle;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 85
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 86
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     .line 87
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 88
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v6, v1, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 89
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\""
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v6, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 94
a=0;//     add-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     .line 95
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "\r\n--"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 98
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 100
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     #v2=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 109
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 110
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 112
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v6, v3, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     instance-of v6, v3, [Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     :cond_2
a=0;//     instance-of v3, v3, [Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 117
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 121
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "="
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Ljava/lang/String;
a=0;// 
a=0;//     .line 123
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 124
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v3, v6, :cond_5
a=0;// 
a=0;//     .line 125
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 126
a=0;//     aget-object v6, v0, v3
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 124
a=0;//     :goto_4
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 120
a=0;//     :cond_3
a=0;//     #v3=(Boolean);v6=(Boolean);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 129
a=0;//     :cond_4
a=0;//     #v3=(Integer);v6=(Integer);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, ","
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     aget-object v7, v0, v3
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Boolean);
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 140
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 133
a=0;//     :cond_6
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Boolean);v6=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 137
a=0;//     :goto_6
a=0;//     #v3=(Conflicted);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v6, "="
a=0;// 
a=0;//     invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 136
a=0;//     :cond_7
a=0;//     #v0=(Reference,Ljava/lang/String;);v3=(Boolean);v6=(Boolean);
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 141
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v3=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encrypt(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     .line 671
a=0;//     :try_start_0
a=0;//     const-string v0, "MD5"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 672
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 673
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 674
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 675
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 676
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     aget-byte v4, v1, v0
a=0;// 
a=0;//     .line 677
a=0;//     #v4=(Byte);
a=0;//     ushr-int/lit8 v5, v4, 0x4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Lcom/tencent/utils/Util;->a(I)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 678
a=0;//     invoke-static {v4}, Lcom/tencent/utils/Util;->a(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 676
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 680
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 686
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 683
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 684
a=0;//     #v0=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static fileExists(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 882
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 889
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 885
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 886
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 887
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getAppVersion(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 825
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 827
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
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
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 828
a=0;//     iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 832
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 829
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 830
a=0;//     sget-object v1, Lcom/tencent/utils/Util;->a:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "getAppVersion error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 831
a=0;//     invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     .line 832
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final getApplicationLable(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 843
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     .line 844
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 845
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 846
a=0;//     invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 849
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getUserIp()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 490
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Enumeration;);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 491
a=0;//     invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/net/NetworkInterface;
a=0;// 
a=0;//     .line 492
a=0;//     invoke-virtual {v0}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 493
a=0;//     :cond_1
a=0;//     #v2=(Reference,Ljava/util/Enumeration;);
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 494
a=0;//     invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/net/InetAddress;
a=0;// 
a=0;//     .line 495
a=0;//     invoke-virtual {v0}, Ljava/net/InetAddress;->isLoopbackAddress()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 496
a=0;//     invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 503
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 500
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 501
a=0;//     #v0=(Reference,Ljava/net/SocketException;);
a=0;//     const-string v1, "Tencent-Util"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/net/SocketException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/tencent/utils/Util;->logd(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 503
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hasSDCard()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 729
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 730
a=0;//     #v0=(Null);
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "mounted"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 732
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 733
a=0;//     invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 735
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 736
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 739
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static hexToString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 790
a=0;//     #v0=(Null);
a=0;//     const-string v1, "0x"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 792
a=0;//     invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 794
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     new-array v2, v1, [B
a=0;// 
a=0;//     .line 795
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Integer);
a=0;//     array-length v1, v2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 799
a=0;//     mul-int/lit8 v1, v0, 0x2
a=0;// 
a=0;//     mul-int/lit8 v3, v0, 0x2
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v1, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, v2, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 795
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 801
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 803
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 809
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v1, "utf-8"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     .line 815
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 811
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 813
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static isEmpty(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isMobileQQSupportShare(Landroid/content/Context;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 652
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 655
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const-string v2, "com.tencent.mobileqq"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 656
a=0;//     iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "4.1"
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/tencent/utils/SystemUtils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 659
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 657
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Reference,Ujava/lang/Object;);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 658
a=0;//     const-string v1, "checkMobileQQ"
a=0;// 
a=0;//     const-string v2, "error"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final isValidPath(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 870
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 877
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 873
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 874
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 875
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static final isValidUrl(Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 858
a=0;//     #v0=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 861
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     const-string v1, "http://"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "https://"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static logd(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 482
a=0;//     sget-boolean v0, Lcom/tencent/utils/Util;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 483
a=0;//     invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 485
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static openBrowser(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 558
a=0;//     .line 561
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 562
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 563
a=0;//     :try_start_1
a=0;//     const-string v2, "com.tencent.mtt"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.tencent.mtt.MainActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 607
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 566
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v2, "com.android.browser"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "com.android.browser.BrowserActivity"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v2, v3, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 570
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 572
a=0;//     :goto_2
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 575
a=0;//     :try_start_2
a=0;//     const-string v1, "com.android.browser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "com.android.browser.BrowserActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v2, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 577
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 580
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "com.google.android.browser"
a=0;// 
a=0;//     const-string v2, "com.android.browser.BrowserActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v2, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_3
a=0;//     .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 582
a=0;//     :catch_2
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 584
a=0;//     :try_start_4
a=0;//     const-string v1, "com.android.chrome"
a=0;// 
a=0;//     const-string v2, "com.google.android.apps.chrome.Main"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v2, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_4
a=0;//     .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 586
a=0;//     :catch_3
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 594
a=0;//     :cond_1
a=0;//     :try_start_5
a=0;//     #v1=(Boolean);
a=0;//     const-string v1, "com.google.android.browser"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "com.android.browser.BrowserActivity"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v2, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_5
a=0;//     .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 596
a=0;//     :catch_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 598
a=0;//     :try_start_6
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "com.android.chrome"
a=0;// 
a=0;//     const-string v2, "com.google.android.apps.chrome.Main"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1, v2, p1}, Lcom/tencent/utils/Util;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_6
a=0;//     .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 600
a=0;//     :catch_5
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 570
a=0;//     :catch_6
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static parseJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/json/JSONException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 410
a=0;//     const-string v0, "false"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 412
a=0;//     const-string p0, "{value : false}"
a=0;// 
a=0;//     .line 414
a=0;//     :cond_0
a=0;//     const-string v0, "true"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 415
a=0;//     const-string p0, "{value : true}"
a=0;// 
a=0;//     .line 419
a=0;//     :cond_1
a=0;//     const-string v0, "allback("
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 420
a=0;//     const-string v0, "[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "$1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 422
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 425
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const-string v0, "online"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 426
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "{online:"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x2
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "}"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 428
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 457
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static parseUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     const-string v0, "auth://"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "http://"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 189
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/net/URL;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 190
a=0;//     #v1=(Reference,Ljava/net/URL;);
a=0;//     invoke-virtual {v1}, Ljava/net/URL;->getQuery()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v1}, Ljava/net/URL;->getRef()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/tencent/utils/Util;->decodeUrl(Ljava/lang/String;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 194
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 193
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static parseUrlToJson(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     const-string v0, "auth://"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "http://"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
a=0;//     :try_start_0
a=0;//     new-instance v1, Ljava/net/URL;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 203
a=0;//     #v1=(Reference,Ljava/net/URL;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v1}, Ljava/net/URL;->getQuery()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v2}, Lcom/tencent/utils/Util;->decodeUrlToJson(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 204
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-virtual {v1}, Ljava/net/URL;->getRef()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/tencent/utils/Util;->decodeUrlToJson(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
a=0;//     :try_end_0
a=0;//     .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 207
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 206
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 207
a=0;//     new-instance v0, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lorg/json/JSONObject;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static reportBernoulli(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 703
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 704
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "appid_for_getting_config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 705
a=0;//     const-string v1, "strValue"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 706
a=0;//     const-string v1, "nValue"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 707
a=0;//     const-string v1, "qver"
a=0;// 
a=0;//     const-string v2, "2.2.1"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 708
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     cmp-long v1, p2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 709
a=0;//     const-string v1, "elt"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p2, p3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V
a=0;// 
a=0;//     .line 712
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     new-instance v1, Lcom/tencent/utils/Util$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/utils/Util$1;);
a=0;//     invoke-direct {v1, p0, v0}, Lcom/tencent/utils/Util$1;-><init>(Landroid/content/Context;Landroid/os/Bundle;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/utils/Util$1;);
a=0;//     invoke-virtual {v1}, Lcom/tencent/utils/Util$1;->start()V
a=0;// 
a=0;//     .line 722
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static showAlert(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 469
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 470
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 471
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 472
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final subString(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 902
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 903
a=0;//     const-string p0, ""
a=0;// 
a=0;//     .line 932
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 905
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v1, "UTF-8"
a=0;// 
a=0;//     .line 906
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 910
a=0;//     :goto_1
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, p1, :cond_0
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     .line 915
a=0;//     :goto_2
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 916
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     array-length v2, v2
a=0;// 
a=0;//     .line 917
a=0;//     #v2=(Integer);
a=0;//     add-int v3, v1, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, p1, :cond_3
a=0;// 
a=0;//     .line 918
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 919
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 920
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     .line 923
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 925
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     .line 915
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 929
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 930
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "StructMsg sSubString error : "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 929
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Integer);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     move-object p2, v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static toHexString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 776
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 777
a=0;//     #v1=(Reference,[B);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 779
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     .line 781
a=0;//     sget-object v3, Lcom/tencent/utils/Util;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-byte v4, v1, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit16 v4, v4, 0xf0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v4, v4, 0x4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 782
a=0;//     sget-object v3, Lcom/tencent/utils/Util;->c:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     aget-byte v4, v1, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     and-int/lit8 v4, v4, 0xf
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v4, v4, 0x0
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 779
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 784
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static toHexString([B)Ljava/lang/String;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 751
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 752
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 763
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 754
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 755
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 756
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     .line 757
a=0;//     aget-byte v1, p0, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x10
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v1, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 758
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 759
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "0"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 761
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 756
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 763
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static upload(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lcom/tencent/utils/Util$Statistic;
a=0;//     .locals 11
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/net/MalformedURLException;,
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;,
a=0;//             Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     .line 260
a=0;//     const-string v0, "connectivity"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 262
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 263
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 264
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 266
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;);
a=0;//     const-string v1, "network unavailable"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$NetworkUnavailableException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 271
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Uninit);
a=0;//     new-instance v2, Landroid/os/Bundle;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v2, p2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 272
a=0;//     #v2=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     .line 273
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "appid_for_getting_config"
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 274
a=0;//     const-string v1, "appid_for_getting_config"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 275
a=0;//     invoke-static {p0, v0, p1}, Lcom/tencent/utils/HttpUtils;->getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 294
a=0;//     #v3=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 295
a=0;//     #v4=(Null);
a=0;//     new-instance v5, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 297
a=0;//     #v5=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     new-instance v6, Landroid/os/Bundle;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v6}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 298
a=0;//     #v6=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v7=(Reference,Ljava/util/Iterator;);v8=(Conflicted);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 299
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 300
a=0;//     instance-of v8, v1, [B
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 301
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 304
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v8=(Conflicted);
a=0;//     const-string v0, "Content-Type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "multipart/form-data; boundary=3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 306
a=0;//     const-string v0, "Connection"
a=0;// 
a=0;//     const-string v1, "Keep-Alive"
a=0;// 
a=0;//     invoke-virtual {v5, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 307
a=0;//     new-instance v7, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 309
a=0;//     #v7=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const-string v0, "--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 310
a=0;//     const-string v0, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/tencent/utils/Util;->encodePostBody(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {v6}, Landroid/os/Bundle;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 317
a=0;//     invoke-virtual {v6}, Landroid/os/Bundle;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 318
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 319
a=0;//     #v0=(Byte);
a=0;//     const-string v1, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v7, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 320
a=0;//     invoke-virtual {v6}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Iterator;);
a=0;//     move v1, v0
a=0;// 
a=0;//     :cond_4
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 321
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 323
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Content-Disposition: form-data; name=\""
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "\"; filename=\""
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "value.file"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "\""
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 326
a=0;//     const-string v9, "Content-Type: application/octet-stream\r\n\r\n"
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v6, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 329
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 332
a=0;//     :cond_5
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v1, v0, :cond_4
a=0;// 
a=0;//     .line 333
a=0;//     const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f\r\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 339
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v0, "\r\n--3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f--\r\n"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 340
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 341
a=0;//     array-length v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v1, v4
a=0;// 
a=0;//     .line 342
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V
a=0;// 
a=0;//     .line 343
a=0;//     new-instance v2, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v2, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 344
a=0;//     #v2=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v5, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 347
a=0;//     invoke-interface {v3, v5}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 348
a=0;//     invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 349
a=0;//     invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 351
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v2, v3, :cond_7
a=0;// 
a=0;//     .line 352
a=0;//     invoke-static {v0}, Lcom/tencent/utils/Util;->a(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 358
a=0;//     new-instance v2, Lcom/tencent/utils/Util$Statistic;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/tencent/utils/Util$Statistic;);
a=0;//     invoke-direct {v2, v0, v1}, Lcom/tencent/utils/Util$Statistic;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/utils/Util$Statistic;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 355
a=0;//     :cond_7
a=0;//     #v2=(Integer);
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$HttpStatusException;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http status code error:"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/tencent/utils/HttpUtils$HttpStatusException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$HttpStatusException;);
a=0;//     throw v0
a=0;// .end method
}}
