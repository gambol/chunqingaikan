package net.slidingmenu.tools.b.b.f; class h { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/f/h;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lnet/slidingmenu/tools/b/b/f/g;
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:[I
a=0;// 
a=0;// .field private e:Ljava/util/Random;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lnet/slidingmenu/tools/b/b/f/g;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iput-object p1, p0, Lnet/slidingmenu/tools/b/b/f/h;->a:Lnet/slidingmenu/tools/b/b/f/g;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/h;);
a=0;//     new-instance v0, Ljava/util/Random;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Random;);
a=0;//     invoke-direct {v0}, Ljava/util/Random;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->e:Ljava/util/Random;
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->c:I
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lnet/slidingmenu/tools/b/b/f/g;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0, p1}, Lnet/slidingmenu/tools/b/b/f/h;-><init>(Lnet/slidingmenu/tools/b/b/f/g;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/h;);
a=0;//     iput p2, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Lnet/slidingmenu/tools/b/b/f/g;Lnet/slidingmenu/tools/b/b/f/e;)V
a=0;//     .locals 3
a=0;// 
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/f/e;->f()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Lnet/slidingmenu/tools/b/b/f/h;-><init>(Lnet/slidingmenu/tools/b/b/f/g;I)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/h;);
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/f/e;->f()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->c:I
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p2}, Lnet/slidingmenu/tools/b/b/f/e;->f()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v1, v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a()I
a=0;//     .locals 2
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->e:Ljava/util/Random;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Random;);
a=0;//     const v1, 0xffff
a=0;// 
a=0;//     #v1=(Char);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(I)I
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v0, v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method a(Lnet/slidingmenu/tools/b/b/f/f;)V
a=0;//     .locals 2
a=0;// 
a=0;//     invoke-virtual {p0}, Lnet/slidingmenu/tools/b/b/f/h;->a()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1, v0}, Lnet/slidingmenu/tools/b/b/f/f;->b(I)V
a=0;// 
a=0;//     const/16 v0, 0x100
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {p1, v0}, Lnet/slidingmenu/tools/b/b/f/f;->b(I)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aget v1, v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p1, v1}, Lnet/slidingmenu/tools/b/b/f/f;->b(I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method b(I)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v0, v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0xffff
a=0;// 
a=0;//     #v1=(Char);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "DNS section count cannot be incremented"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Char);
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v1, v0, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clone()Ljava/lang/Object;
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     new-instance v0, Lnet/slidingmenu/tools/b/b/f/h;
a=0;// 
a=0;//     #v0=(UninitRef,Lnet/slidingmenu/tools/b/b/f/h;);
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->a:Lnet/slidingmenu/tools/b/b/f/g;
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/f/g;);
a=0;//     invoke-direct {v0, v1}, Lnet/slidingmenu/tools/b/b/f/h;-><init>(Lnet/slidingmenu/tools/b/b/f/g;)V
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/f/h;);
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Lnet/slidingmenu/tools/b/b/f/h;->b:I
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->c:I
a=0;// 
a=0;//     iput v1, v0, Lnet/slidingmenu/tools/b/b/f/h;->c:I
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v2, v0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/b/f/h;->d:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
