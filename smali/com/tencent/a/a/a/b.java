package com.tencent.a.a.a; class b { void a() { int a;
a=0;// .class public Lcom/tencent/a/a/a/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mReqDelay:I
a=0;// 
a=0;// .field private mReqGeoType:I
a=0;// 
a=0;// .field private mReqLevel:I
a=0;// 
a=0;// .field private mReqType:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(IIII)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/a/a/a/b;);
a=0;//     iput v2, p0, Lcom/tencent/a/a/a/b;->mReqType:I
a=0;// 
a=0;//     iput v3, p0, Lcom/tencent/a/a/a/b;->mReqLevel:I
a=0;// 
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Lcom/tencent/a/a/a/b;->mReqDelay:I
a=0;// 
a=0;//     iput v2, p0, Lcom/tencent/a/a/a/b;->mReqGeoType:I
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "argument: "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget v1, p0, Lcom/tencent/a/a/a/b;->mReqType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/a/a/a/b;->mReqGeoType:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, " "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v1, p0, Lcom/tencent/a/a/a/b;->mReqLevel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/tencent/a/b/h;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     if-gt p1, v2, :cond_0
a=0;// 
a=0;//     iput p1, p0, Lcom/tencent/a/a/a/b;->mReqType:I
a=0;// 
a=0;//     :cond_0
a=0;//     if-ltz p2, :cond_1
a=0;// 
a=0;//     if-gt p2, v2, :cond_1
a=0;// 
a=0;//     iput p2, p0, Lcom/tencent/a/a/a/b;->mReqGeoType:I
a=0;// 
a=0;//     :cond_1
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p3, v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     if-eq p3, v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     if-ne p3, v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iput p3, p0, Lcom/tencent/a/a/a/b;->mReqLevel:I
a=0;// 
a=0;//     :cond_3
a=0;//     iget v0, p0, Lcom/tencent/a/a/a/b;->mReqGeoType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_4
a=0;// 
a=0;//     iput v3, p0, Lcom/tencent/a/a/a/b;->mReqLevel:I
a=0;// 
a=0;//     :cond_4
a=0;//     iput p4, p0, Lcom/tencent/a/a/a/b;->mReqDelay:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getReqDelay()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/a/a/a/b;->mReqDelay:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getReqGeoType()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/a/a/a/b;->mReqGeoType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getReqLevel()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/a/a/a/b;->mReqLevel:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getReqType()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lcom/tencent/a/a/a/b;->mReqType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onLocationDataUpdate([BI)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLocationUpdate(Lcom/tencent/a/a/a/d;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onStatusUpdate(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
