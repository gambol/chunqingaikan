package com.handmark.pulltorefresh.library.internal; class ViewCompat { void a() { int a;
a=0;// .class public Lcom/handmark/pulltorefresh/library/internal/ViewCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/handmark/pulltorefresh/library/internal/ViewCompat$SDK11;,
a=0;//         Lcom/handmark/pulltorefresh/library/internal/ViewCompat$SDK16;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/handmark/pulltorefresh/library/internal/ViewCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;//     .locals 2
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "runnable"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     invoke-static {p0, p1}, Lcom/handmark/pulltorefresh/library/internal/ViewCompat$SDK16;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 33
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     const-wide/16 v0, 0x10
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     invoke-virtual {p0, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 2
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "background"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     invoke-static {p0, p1}, Lcom/handmark/pulltorefresh/library/internal/ViewCompat$SDK16;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 41
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static setLayerType(Landroid/view/View;I)V
a=0;//     .locals 2
a=0;//     .param p0, "view"    # Landroid/view/View;
a=0;//     .param p1, "layerType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     invoke-static {p0, p1}, Lcom/handmark/pulltorefresh/library/internal/ViewCompat$SDK11;->setLayerType(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 47
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
