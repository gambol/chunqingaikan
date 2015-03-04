package android.support.v4.app; class NotificationCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompat$Action;,
a=0;//         Landroid/support/v4/app/NotificationCompat$InboxStyle;,
a=0;//         Landroid/support/v4/app/NotificationCompat$BigTextStyle;,
a=0;//         Landroid/support/v4/app/NotificationCompat$BigPictureStyle;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Style;,
a=0;//         Landroid/support/v4/app/NotificationCompat$Builder;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;,
a=0;//         Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final FLAG_HIGH_PRIORITY:I = 0x80
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;// .field public static final PRIORITY_DEFAULT:I = 0x0
a=0;// 
a=0;// .field public static final PRIORITY_HIGH:I = 0x1
a=0;// 
a=0;// .field public static final PRIORITY_LOW:I = -0x1
a=0;// 
a=0;// .field public static final PRIORITY_MAX:I = 0x2
a=0;// 
a=0;// .field public static final PRIORITY_MIN:I = -0x2
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 153
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplIceCreamSandwich;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 156
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplHoneycomb;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 158
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 761
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat;->IMPL:Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;);
a=0;//     return-object v0
a=0;// .end method
}}
