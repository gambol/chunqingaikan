package net.slidingmenu.tools.b.a.e.g; class g { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/e/g/g;
a=0;// .super Lnet/slidingmenu/tools/b/a/e/g/c;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:I
a=0;// 
a=0;// .field private b:I
a=0;// 
a=0;// .field private c:I
a=0;// 
a=0;// .field private d:I
a=0;// 
a=0;// .field private e:D
a=0;// 
a=0;// .field private f:D
a=0;// 
a=0;// .field private g:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 4
a=0;// 
a=0;//     const/16 v3, -0x270f
a=0;// 
a=0;//     #v3=(Short);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Lnet/slidingmenu/tools/b/a/e/g/c;-><init>(II)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/e/g/g;);
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->a:I
a=0;// 
a=0;//     iput v3, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->b:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->c:I
a=0;// 
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->d:I
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->e:D
a=0;// 
a=0;//     iput-wide v1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->f:D
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Landroid/content/Context;)I
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->f:D
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     cmpl-double v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->e:D
a=0;// 
a=0;//     #v1=(DoubleLo);
a=0;//     cmpl-double v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->e:D
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);v1=(Byte);v2=(DoubleHi);v3=(LongLo);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->c()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v1, v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->d:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->c:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(D)V
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/high16 v0, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmpg-double v4, p1, v2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     cmpl-double v4, v2, v0
a=0;// 
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->e:D
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     move-wide v2, p1
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->g:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b(Landroid/content/Context;)I
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/16 v3, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->f:D
a=0;// 
a=0;//     #v1=(DoubleLo);v2=(DoubleHi);
a=0;//     cmpl-double v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->e:D
a=0;// 
a=0;//     #v1=(DoubleLo);
a=0;//     cmpl-double v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->c()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-double v0, v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     iget-wide v2, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->f:D
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-int v0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);v1=(Byte);v2=(DoubleHi);v3=(LongLo);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->b()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Lnet/slidingmenu/tools/b/b/k/f;->c()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v1, v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->c:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->d:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public b(D)V
a=0;//     .locals 5
a=0;// 
a=0;//     const-wide/high16 v0, 0x3ff0000000000000L    # 1.0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmpg-double v4, p1, v2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gez v4, :cond_1
a=0;// 
a=0;//     :goto_0
a=0;//     cmpl-double v4, v2, v0
a=0;// 
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     iput-wide v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->f:D
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     move-wide v0, v2
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     move-wide v2, p1
a=0;// 
a=0;//     #v2=(DoubleLo);v3=(DoubleHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public e(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->a:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public f(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->b:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public g(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->c:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public h(I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->d:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public s()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public t()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->b:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public u()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->c:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public v()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->d:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public w()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->g:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public x()D
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->e:D
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public y()D
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/a/e/g/g;->f:D
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     return-wide v0
a=0;// .end method
}}
