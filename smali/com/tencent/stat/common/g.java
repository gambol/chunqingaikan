package com.tencent.stat.common; class g { void a() { int a;
a=0;// .class public Lcom/tencent/stat/common/g;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final synthetic a:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-class v0, Lcom/tencent/stat/common/g;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     sput-boolean v0, Lcom/tencent/stat/common/g;->a:Z
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/common/g;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a([BI)[B
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v0, v1, p1}, Lcom/tencent/stat/common/g;->a([BIII)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static a([BIII)[B
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     new-instance v1, Lcom/tencent/stat/common/i;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/common/i;);
a=0;//     mul-int/lit8 v0, p2, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-direct {v1, p3, v0}, Lcom/tencent/stat/common/i;-><init>(I[B)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/i;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v1, p0, p1, p2, v0}, Lcom/tencent/stat/common/i;->a([BIIZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "bad base-64"
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget v0, v1, Lcom/tencent/stat/common/i;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, v1, Lcom/tencent/stat/common/i;->a:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     array-length v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     iget-object v0, v1, Lcom/tencent/stat/common/i;->a:[B
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,[B);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Reference,Lcom/tencent/stat/common/i;);v2=(Integer);
a=0;//     iget v0, v1, Lcom/tencent/stat/common/i;->b:I
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v2, v1, Lcom/tencent/stat/common/i;->a:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     iget v1, v1, Lcom/tencent/stat/common/i;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static b([BI)[B
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p0, v0, v1, p1}, Lcom/tencent/stat/common/g;->b([BIII)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static b([BIII)[B
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-instance v3, Lcom/tencent/stat/common/j;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/tencent/stat/common/j;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {v3, p3, v0}, Lcom/tencent/stat/common/j;-><init>(I[B)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/tencent/stat/common/j;);
a=0;//     div-int/lit8 v0, p2, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     iget-boolean v1, v3, Lcom/tencent/stat/common/j;->d:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     rem-int/lit8 v1, p2, 0x3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     iget-boolean v1, v3, Lcom/tencent/stat/common/j;->e:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     add-int/lit8 v1, p2, -0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x39
a=0;// 
a=0;//     add-int/lit8 v4, v1, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-boolean v1, v3, Lcom/tencent/stat/common/j;->f:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     mul-int/2addr v1, v4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr v0, v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     new-array v1, v0, [B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iput-object v1, v3, Lcom/tencent/stat/common/j;->a:[B
a=0;// 
a=0;//     invoke-virtual {v3, p0, p1, p2, v2}, Lcom/tencent/stat/common/j;->a([BIIZ)Z
a=0;// 
a=0;//     sget-boolean v1, Lcom/tencent/stat/common/g;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     iget v1, v3, Lcom/tencent/stat/common/j;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/AssertionError;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/AssertionError;);
a=0;//     invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/AssertionError;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Boolean);v4=(Uninit);
a=0;//     rem-int/lit8 v1, p2, 0x3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     add-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     add-int/lit8 v0, v0, 0x3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v4=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v1=(Integer);v4=(Conflicted);
a=0;//     iget-object v0, v3, Lcom/tencent/stat/common/j;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
