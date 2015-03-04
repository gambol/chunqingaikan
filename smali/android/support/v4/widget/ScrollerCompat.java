package android.support.v4.widget; class ScrollerCompat { void a() { int a;
a=0;// .class Landroid/support/v4/widget/ScrollerCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ScrollerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     new-instance v0, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/Scroller;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static from(Landroid/content/Context;)Landroid/support/v4/widget/ScrollerCompat;
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     new-instance v0, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/ScrollerCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abortAnimation()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 180
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScrollOffset()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public fling(IIIIIIII)V
a=0;//     .locals 9
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "velocityX"    # I
a=0;//     .param p4, "velocityY"    # I
a=0;//     .param p5, "minX"    # I
a=0;//     .param p6, "maxX"    # I
a=0;//     .param p7, "minY"    # I
a=0;//     .param p8, "maxY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, p6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move/from16 v7, p7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move/from16 v8, p8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCurrVelocity()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrX()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrY()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDuration()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isFinished()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public startScroll(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/Scroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startScroll(IIIII)V
a=0;//     .locals 6
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "dy"    # I
a=0;//     .param p5, "duration"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
}}
