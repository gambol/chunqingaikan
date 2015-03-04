package cn.dm.android.f; class g { void a() { int a;
a=0;// .class public Lcn/dm/android/f/g;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String; = "ODIN"
a=0;// 
a=0;// .field private static final b:Ljava/lang/String; = "SHA-1"
a=0;// 
a=0;// .field private static final c:Ljava/lang/String; = "iso-8859-1"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v1, "android_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 56
a=0;//     :goto_0
a=0;//     invoke-static {v0}, Lcn/dm/android/f/g;->a(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 44
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 49
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "android_id"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 50
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     :try_start_0
a=0;//     const-string v0, "SHA-1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 79
a=0;//     const/16 v1, 0x28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v1, v1, [B
a=0;// 
a=0;//     .line 80
a=0;//     #v1=(Reference,[B);
a=0;//     const-string v1, "iso-8859-1"
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 83
a=0;//     invoke-static {v0}, Lcn/dm/android/f/g;->a([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 86
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 84
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 86
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a([B)Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v1=(Null);
a=0;//     new-instance v5, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuffer;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     array-length v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 62
a=0;//     aget-byte v2, p0, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     ushr-int/lit8 v2, v2, 0x4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0xf
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 65
a=0;//     :goto_1
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     const/16 v4, 0x9
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-gt v3, v4, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     add-int/lit8 v3, v3, 0x30
a=0;// 
a=0;//     int-to-char v3, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 69
a=0;//     :goto_2
a=0;//     #v4=(Conflicted);
a=0;//     aget-byte v3, p0, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit8 v4, v3, 0xf
a=0;// 
a=0;//     .line 70
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v3, v2, 0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-lt v2, v6, :cond_2
a=0;// 
a=0;//     .line 61
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, -0xa
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x61
a=0;// 
a=0;//     int-to-char v3, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     invoke-virtual {v5, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 72
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v3=(Integer);v4=(Integer);v6=(One);
a=0;//     move v2, v3
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
