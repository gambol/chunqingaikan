package com.actionbarsherlock.internal; class ActionBarSherlockNative$ActionModeWrapper { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;
a=0;// .super Lcom/actionbarsherlock/view/ActionMode;
a=0;// .source "ActionBarSherlockNative.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ActionModeWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;// .field private mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/actionbarsherlock/internal/ActionBarSherlockNative;Landroid/view/ActionMode;)V
a=0;//     .locals 1
a=0;//     .param p2, "actionMode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     invoke-direct {p0}, Lcom/actionbarsherlock/view/ActionMode;-><init>()V
a=0;// 
a=0;//     .line 257
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     .line 260
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     .line 261
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public finish()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V
a=0;// 
a=0;//     .line 296
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCustomView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0}, Landroid/view/ActionMode;->getCustomView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenu()Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     new-instance v0, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v1}, Landroid/view/ActionMode;->getMenu()Landroid/view/Menu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     iput-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     .line 303
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mMenu:Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getMenu()Lcom/actionbarsherlock/view/Menu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-virtual {p0}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->getMenu()Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/view/menu/MenuWrapper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockNative;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockNative;);
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockNative;->getMenuInflater()Lcom/actionbarsherlock/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0}, Landroid/view/ActionMode;->getSubtitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTag()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0}, Landroid/view/ActionMode;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0}, Landroid/view/ActionMode;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public invalidate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0}, Landroid/view/ActionMode;->invalidate()V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setCustomView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setSubtitle(I)V
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 276
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTag(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "tag"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setTitle(I)V
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockNative$ActionModeWrapper;->mActionMode:Landroid/view/ActionMode;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ActionMode;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 266
a=0;//     return-void
a=0;// .end method
}}