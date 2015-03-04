package com.lidroid.xutils.util.core; class LruDiskCache$MD5DiskCacheFileNameGenerator { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LruDiskCache.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/util/core/LruDiskCache$DiskCacheFileNameGenerator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "MD5DiskCacheFileNameGenerator"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/lidroid/xutils/util/core/LruDiskCache;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1213
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;->this$0:Lcom/lidroid/xutils/util/core/LruDiskCache;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1214
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private bytesToHexString([B)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p1, "bytes"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 1229
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 1230
a=0;//     .local v2, "sb":Ljava/lang/StringBuilder;
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 1237
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 1231
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     aget-byte v3, p1, v1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     and-int/lit16 v3, v3, 0xff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1232
a=0;//     .local v0, "hex":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v3, v4, :cond_1
a=0;// 
a=0;//     .line 1233
a=0;//     const/16 v3, 0x30
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1235
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 1230
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public generate(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1219
a=0;//     :try_start_0
a=0;//     const-string v3, "MD5"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1220
a=0;//     .local v2, "mDigest":Ljava/security/MessageDigest;
a=0;//     #v2=(Reference,Ljava/security/MessageDigest;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/security/MessageDigest;->update([B)V
a=0;// 
a=0;//     .line 1221
a=0;//     invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Lcom/lidroid/xutils/util/core/LruDiskCache$MD5DiskCacheFileNameGenerator;->bytesToHexString([B)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1225
a=0;//     .end local v2    # "mDigest":Ljava/security/MessageDigest;
a=0;//     .local v0, "cacheKey":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1222
a=0;//     .end local v0    # "cacheKey":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 1223
a=0;//     .local v1, "e":Ljava/security/NoSuchAlgorithmException;
a=0;//     #v1=(Reference,Ljava/security/NoSuchAlgorithmException;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "cacheKey":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
}}
