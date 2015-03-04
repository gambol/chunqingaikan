package com.tencent.a.b; class e$b { void a() { int a;
a=0;// .class public final Lcom/tencent/a/b/e$b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/a/b/e;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x1
a=0;//     name = "b"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/location/Location;
a=0;// 
a=0;// .field private b:J
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/tencent/a/b/e;Landroid/location/Location;IIIJ)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/b/e$b;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Lcom/tencent/a/b/e$b;->b:J
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lcom/tencent/a/b/e$b;->c:I
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/location/Location;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/location/Location;);
a=0;//     invoke-direct {v0, p2}, Landroid/location/Location;-><init>(Landroid/location/Location;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     iput-object v0, p0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     iput p4, p0, Lcom/tencent/a/b/e$b;->c:I
a=0;// 
a=0;//     iput-wide p6, p0, Lcom/tencent/a/b/e$b;->b:J
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final a()Z
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     #v1=(Reference,Landroid/location/Location;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Landroid/location/Location;);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget v1, p0, Lcom/tencent/a/b/e$b;->c:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/a/b/e$b;->c:I
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-wide v3, p0, Lcom/tencent/a/b/e$b;->b:J
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sub-long/2addr v1, v3
a=0;// 
a=0;//     const-wide/16 v3, 0x7530
a=0;// 
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final b()Landroid/location/Location;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     #v0=(Reference,Landroid/location/Location;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final clone()Ljava/lang/Object;
a=0;//     .locals 3
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/tencent/a/b/e$b;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     #v1=(Reference,Landroid/location/Location;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Landroid/location/Location;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/location/Location;);
a=0;//     iget-object v2, p0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     #v2=(Reference,Landroid/location/Location;);
a=0;//     invoke-direct {v1, v2}, Landroid/location/Location;-><init>(Landroid/location/Location;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/location/Location;);
a=0;//     iput-object v1, v0, Lcom/tencent/a/b/e$b;->a:Landroid/location/Location;
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
