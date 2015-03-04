package com.actionbarsherlock.internal.widget; class IcsColorDrawable { void a() { int a;
a=0;// .class public Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;
a=0;// .super Landroid/graphics/drawable/Drawable;
a=0;// .source "IcsColorDrawable.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private color:I
a=0;// 
a=0;// .field private final paint:Landroid/graphics/Paint;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V
a=0;// 
a=0;//     .line 13
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;);
a=0;//     new-instance v0, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->paint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 16
a=0;//     iput p1, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 2
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     ushr-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 21
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->paint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 22
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->getBounds()Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->paint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 24
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getOpacity()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     ushr-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setAlpha(I)V
a=0;//     .locals 2
a=0;//     .param p1, "alpha"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     ushr-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0xffffff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     shl-int/lit8 v1, p1, 0x18
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->color:I
a=0;// 
a=0;//     .line 30
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/widget/IcsColorDrawable;->invalidateSelf()V
a=0;// 
a=0;//     .line 32
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setColorFilter(Landroid/graphics/ColorFilter;)V
a=0;//     .locals 0
a=0;//     .param p1, "colorFilter"    # Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     return-void
a=0;// .end method
}}
