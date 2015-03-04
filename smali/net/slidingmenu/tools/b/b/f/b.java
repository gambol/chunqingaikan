package net.slidingmenu.tools.b.b.f; class b { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/b/f/b;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:[Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/b/f/b;);
a=0;//     const/16 v0, 0x11
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     #v0=(Reference,[Lnet/slidingmenu/tools/b/b/f/d;);
a=0;//     iput-object v0, p0, Lnet/slidingmenu/tools/b/b/f/b;->a:[Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lnet/slidingmenu/tools/b/b/f/j;)I
a=0;//     .locals 4
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0x7fffffff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     rem-int/lit8 v0, v0, 0x11
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/b;->a:[Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     #v2=(Reference,[Lnet/slidingmenu/tools/b/b/f/d;);
a=0;//     aget-object v0, v2, v0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Reference,Lnet/slidingmenu/tools/b/b/f/d;);v2=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v2, v1, Lnet/slidingmenu/tools/b/b/f/d;->a:Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/f/j;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v0, v1, Lnet/slidingmenu/tools/b/b/f/d;->b:I
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, v1, Lnet/slidingmenu/tools/b/b/f/d;->c:Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(ILnet/slidingmenu/tools/b/b/f/j;)V
a=0;//     .locals 3
a=0;// 
a=0;//     const/16 v0, 0x3fff
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-le p1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosShort);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0x7fffffff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     rem-int/lit8 v0, v0, 0x11
a=0;// 
a=0;//     new-instance v1, Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     #v1=(UninitRef,Lnet/slidingmenu/tools/b/b/f/d;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, v2}, Lnet/slidingmenu/tools/b/b/f/d;-><init>(Lnet/slidingmenu/tools/b/b/f/c;)V
a=0;// 
a=0;//     #v1=(Reference,Lnet/slidingmenu/tools/b/b/f/d;);
a=0;//     iput-object p2, v1, Lnet/slidingmenu/tools/b/b/f/d;->a:Lnet/slidingmenu/tools/b/b/f/j;
a=0;// 
a=0;//     iput p1, v1, Lnet/slidingmenu/tools/b/b/f/d;->b:I
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/b;->a:[Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     #v2=(Reference,[Lnet/slidingmenu/tools/b/b/f/d;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-object v2, v1, Lnet/slidingmenu/tools/b/b/f/d;->c:Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/b/f/b;->a:[Lnet/slidingmenu/tools/b/b/f/d;
a=0;// 
a=0;//     #v2=(Reference,[Lnet/slidingmenu/tools/b/b/f/d;);
a=0;//     aput-object v1, v2, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
