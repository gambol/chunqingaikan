package android.support.v4.view; class MenuItemCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/MenuItemCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuItemCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;,
a=0;//         Landroid/support/v4/view/MenuItemCompat$BaseMenuVersionImpl;,
a=0;//         Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
a=0;// 
a=0;// .field public static final SHOW_AS_ACTION_ALWAYS:I = 0x2
a=0;// 
a=0;// .field public static final SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW:I = 0x8
a=0;// 
a=0;// .field public static final SHOW_AS_ACTION_IF_ROOM:I = 0x1
a=0;// 
a=0;// .field public static final SHOW_AS_ACTION_NEVER:I = 0x0
a=0;// 
a=0;// .field public static final SHOW_AS_ACTION_WITH_TEXT:I = 0x4
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
a=0;// 
a=0;//     .line 109
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/MenuItemCompat$BaseMenuVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/MenuItemCompat$BaseMenuVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/MenuItemCompat$BaseMenuVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompat$BaseMenuVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 87
a=0;//     #p0=(Reference,Landroid/support/v4/view/MenuItemCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setActionView(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->setActionView(Landroid/view/MenuItem;Landroid/view/View;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static setShowAsAction(Landroid/view/MenuItem;I)Z
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     sget-object v0, Landroid/support/v4/view/MenuItemCompat;->IMPL:Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MenuItemCompat$MenuVersionImpl;->setShowAsAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
