package net.slidingmenu.tools.b.b.f; class f { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/f/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:[B
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/f;-><init>(I)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/f;);
a=0;//     new-array v0, p1, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->c:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(JI)V
a=0;//     .locals 4
a=0;// 
a=0;//     const-wide/16 v0, 0x1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     shl-long/2addr v0, p3
a=0;// 
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " out of range for "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " bit value"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(LongHi);v2=(Byte);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private c(I)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     if-lt v0, p1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     add-int/2addr v1, p1
a=0;// 
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     :cond_1
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/b/f/f;->a(JI)V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/f;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     and-int/lit16 v2, p1, 0xff
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a([BII)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-direct {p0, p3}, Lnet/slidingmenu/tools/b/b/f/f;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p3
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(I)V
a=0;//     .locals 3
a=0;// 
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, v0, v1, v2}, Lnet/slidingmenu/tools/b/b/f/f;->a(JI)V
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v0}, Lnet/slidingmenu/tools/b/b/f/f;->c(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     ushr-int/lit8 v2, p1, 0x8
a=0;// 
a=0;//     and-int/lit16 v2, v2, 0xff
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     add-int/lit8 v2, v1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     and-int/lit16 v2, p1, 0xff
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()[B
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/f;->a:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget v2, p0, Lnet/slidingmenu/tools/b/b/f/f;->b:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
