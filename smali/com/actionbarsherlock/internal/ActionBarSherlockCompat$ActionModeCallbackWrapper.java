package com.actionbarsherlock.internal; class ActionBarSherlockCompat$ActionModeCallbackWrapper { void a() { int a;
a=0;// .class Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarSherlockCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ActionModeCallbackWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mWrapped:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;Lcom/actionbarsherlock/view/ActionMode$Callback;)V
a=0;//     .locals 0
a=0;//     .param p2, "wrapped"    # Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1175
a=0;//     iput-object p1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1176
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;);
a=0;//     iput-object p2, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->mWrapped:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 1177
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActionItemClicked(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Lcom/actionbarsherlock/view/ActionMode;
a=0;//     .param p2, "item"    # Lcom/actionbarsherlock/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1188
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->mWrapped:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onActionItemClicked(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Lcom/actionbarsherlock/view/ActionMode;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1180
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->mWrapped:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onCreateActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyActionMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1192
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->mWrapped:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onDestroyActionMode(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 1193
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$0(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1194
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$0(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 1195
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$0(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/actionbarsherlock/internal/widget/ActionBarContextView;->removeAllViews()V
a=0;// 
a=0;//     .line 1197
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     instance-of v0, v0, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1198
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;);
a=0;//     invoke-static {v0}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$1(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     #v1=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;);
a=0;//     invoke-static {v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$2(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;)Lcom/actionbarsherlock/view/ActionMode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/actionbarsherlock/ActionBarSherlock$OnActionModeFinishedListener;->onActionModeFinished(Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 1200
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->this$0:Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;->access$3(Lcom/actionbarsherlock/internal/ActionBarSherlockCompat;Lcom/actionbarsherlock/view/ActionMode;)V
a=0;// 
a=0;//     .line 1201
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Lcom/actionbarsherlock/view/ActionMode;
a=0;//     .param p2, "menu"    # Lcom/actionbarsherlock/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1184
a=0;//     iget-object v0, p0, Lcom/actionbarsherlock/internal/ActionBarSherlockCompat$ActionModeCallbackWrapper;->mWrapped:Lcom/actionbarsherlock/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Lcom/actionbarsherlock/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Lcom/actionbarsherlock/view/ActionMode$Callback;->onPrepareActionMode(Lcom/actionbarsherlock/view/ActionMode;Lcom/actionbarsherlock/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
