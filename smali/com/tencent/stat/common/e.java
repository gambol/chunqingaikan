package com.tencent.stat.common; class e { void a() { int a;
a=0;// .class public Lcom/tencent/stat/common/e;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final a:[B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, "03a976511e2cbe3a7f26808fb7af3c05"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/stat/common/e;->a:[B
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a([B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/common/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/common/e;->a([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static a([B[B)[B
a=0;//     .locals 8
a=0;// 
a=0;//     const/16 v7, 0x100
a=0;// 
a=0;//     #v7=(PosShort);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v3, v7, [I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     new-array v4, v7, [I
a=0;// 
a=0;//     #v4=(Reference,[I);
a=0;//     array-length v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-lt v2, v1, :cond_0
a=0;// 
a=0;//     if-le v2, v7, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "key must be between 1 and 256 bytes"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(One);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Integer);v5=(Conflicted);
a=0;//     if-ge v1, v7, :cond_2
a=0;// 
a=0;//     aput v1, v3, v1
a=0;// 
a=0;//     rem-int v5, v1, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-byte v5, p1, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     aput v5, v4, v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Integer);v6=(Conflicted);
a=0;//     if-ge v1, v7, :cond_3
a=0;// 
a=0;//     aget v5, v3, v1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v2, v5
a=0;// 
a=0;//     aget v5, v4, v1
a=0;// 
a=0;//     add-int/2addr v2, v5
a=0;// 
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     aget v5, v3, v1
a=0;// 
a=0;//     aget v6, v3, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v3, v1
a=0;// 
a=0;//     aput v5, v3, v2
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     new-array v4, v1, [B
a=0;// 
a=0;//     move v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v0, v5, :cond_4
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     aget v5, v3, v2
a=0;// 
a=0;//     add-int/2addr v1, v5
a=0;// 
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     aget v5, v3, v2
a=0;// 
a=0;//     aget v6, v3, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aput v6, v3, v2
a=0;// 
a=0;//     aput v5, v3, v1
a=0;// 
a=0;//     aget v5, v3, v2
a=0;// 
a=0;//     aget v6, v3, v1
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     and-int/lit16 v5, v5, 0xff
a=0;// 
a=0;//     aget v5, v3, v5
a=0;// 
a=0;//     aget-byte v6, p0, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     xor-int/2addr v5, v6
a=0;// 
a=0;//     int-to-byte v5, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     aput-byte v5, v4, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v5=(Integer);v6=(Conflicted);
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method public static b([B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     sget-object v0, Lcom/tencent/stat/common/e;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {p0, v0}, Lcom/tencent/stat/common/e;->b([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static b([B[B)[B
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-static {p0, p1}, Lcom/tencent/stat/common/e;->a([B[B)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
}}
